package org.irisa.diverse.videogen.videoGen.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.nio.file.Paths
import java.util.List
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.IntConstraintFactory
import org.chocosolver.solver.constraints.SatFactory
import org.chocosolver.solver.constraints.nary.cnf.LogOp
import org.chocosolver.solver.trace.Chatterbox
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VariableFactory
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.BasicEMap
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.EMap
import org.irisa.diverse.videogen.k3dsa.dependencies.transformations.helpers.VideosHelper
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Delay
import org.irisa.diverse.videogen.videoGen.Generate
import org.irisa.diverse.videogen.videoGen.Initialize
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Mimetypes_Enum
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen

import static extension org.irisa.diverse.videogen.videoGen.aspects.TransitionAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.VideoAspect.*

@Aspect(className=VideoGen)
class VideoGenAspect {

	public boolean initialized = false
	private int featureIndex = 0
	//private String executionResult = ""

	@Main
	def void main() {
		_self.execute
	}

	//def String getResult() {
	//	_self.executionResult
	//}

	/**
	 * This method generates a linear model to satisfy the min/max user constraints
	 * 
	 */
	@Step
	def EList<Integer> solve() {
		if (!_self.initialized) {
			return new BasicEList
		}
		val solver = new Solver("Min max durations constraints")
		_self.featureIndex = 0
		val allSolutions = new BasicEMap(1)
		// if (_self.minUserConstraint > _self.maxUserConstraint || _self.maxUserConstraint == 0) {
		// throw new Exception("You have to indicate a min and a max value")
		// }

		// Define the objective scalar with given contraints
		val objective = VariableFactory.bounded(
			"objective",
			_self.minUserConstraint,
			_self.maxUserConstraint,
			solver)
		val variables = new BasicEList(1) // Used to insert optional's coefficient
		val constants = new BasicEList(1) // Used to insert video durations
		// Call the visitor
		_self.transitions.forEach [
			if (it instanceof Mandatory) {
				// A mandatory has a fixed coef value of 1, mandatory right ;)
				val feature = VariableFactory.fixed(it.name, if(it.active) 1 else 0, solver)
				_self.addVar(feature, it.video.duration, constants, variables)

			} else if (it instanceof Optional) {
				// For choco, a bool is a integer between 0 and 1
				_self.createOptionalIntVar(solver, it, constants, variables)

			} else if (it instanceof Alternatives) {
				// Local vars
				if (it.active) {
					val localVars = new BasicEList()
					// Effective parse to inject a feature for each option
					for (Optional opt : it.options) {
						_self.createOptionalIntVar(solver,opt, constants, variables)
						localVars.add(variables.last)
					}
	
					// Create and insert the xor clause
					_self.createAlternativesXorClause(solver, localVars)
				}
			}
		]

		// Create and post constraints by using constraint factories
		solver.post(IntConstraintFactory.scalar(variables, constants, objective))
		// Launch the resolution process
		// solver.findOptimalSolution(ResolutionPolicy.SATISFACTION, objective)
		// solver.findOptimalSolution(ResolutionPolicy.MAXIMIZE, objective)
		// solver.findOptimalSolution(ResolutionPolicy.MINIMIZE, objective)
		
		val solutionUnique = solver.findSolution()
		// Print search statistics
		Chatterbox.printStatistics(solver)
		if(solutionUnique) {
			println(solver)
			// Get all solutions
			var long i = 0
			do {
				i++
				for (intvar: variables) {
					val index = variables.indexOf(intvar)
					if (allSolutions.get(i) == null) {
						allSolutions.put(i, 0)
					}
					allSolutions.put(i, allSolutions.get(i) + (intvar.value * constants.get(index)))
				}
				_self.variantes = _self.variantes + 1
			} while (solver.nextSolution())
			println("Total solutions => " + i)
			
		} else if(solver.hasReachedLimit()){
		    println("The could not find a solution nor prove that none exists in the given limits");
		} else {
		    println("The solver has proved the problem has no solution");
		}
		new BasicEList(allSolutions.values)
	}

	/**
	 * This method is intended to configure the model
	 * Called by the initializeModel method
	 * 
	 */
	@Step
	def private void setup() {
		// Video specific setup
		// Prerequisite for video duration computation
		_self.videos.forEach[it.setup]
		
		// Durations calculation
		val results = newHashMap()
		results.put("min", 0)
		results.put("max", 0)
		results.put("variants", 1) // Found by multiplication
		
		_self.transitions.forEach [ 
			it.selected = false
			it.active = true
			it.executed = false
			it.videoGen = _self
			if (it instanceof Alternatives) {
				var List<Integer> durations = it.options.map[video.duration]
				// durations = _self.options.filter[selected].map[video.duration]
				results.put("min", results.get("min") + durations.min)
				results.put("max", results.get("max") + durations.max)
				results.put("variants", results.get("variants") * it.options.size)
				it.options.forEach [
					it.selected = false
					it.active = true
					it.executed = false
					it.videoGen = _self
				]
			} else if (it instanceof Mandatory) {
				results.put("min", results.get("min") + it.video.duration)
				results.put("max", results.get("max") + it.video.duration)
			} else if (it instanceof Optional) {
				results.put("max", results.get("max") + it.video.duration)
				results.put("variants", results.get("variants") * 2)
			}
		]
		_self.minDurationConstraint = results.get("min")
		_self.maxDurationConstraint = results.get("max")
		_self.variantes = results.get("variants")
		println("############### SETUP RESULT #####################")
		println(results)

		// Visitors calls to populate model mutables
		_self.minUserConstraint = _self.minDurationConstraint
		_self.maxUserConstraint = _self.maxDurationConstraint
		_self.initialized = true
	}

	@InitializeModel
	def public void initializeModel(EList<String> args) {
		_self.setup
	}

	def public void execute() {
		_self.solve
		// Process each transitions, starting with the Initialize
		_self.transitions.filter[it instanceof Initialize].map[it as Initialize].head.execute(_self)
	}

	/**
	 * Starts the computation (model transformation) of all selected video
	 * to create the final sequence (PlayList format)
	 * 
	 */
	//@Step
	def public void compute() {
		val videos = new BasicEMap
		_self.transitions.filter[selected].filter[it instanceof Sequence].map[it as Sequence].map[video].forEach [
			videos.put(name, true)
		]
		// TODO: Manage model transformation here
		// TODO: re-implement the initial IDM project model transformation. See master branch package 'fr.nemomen.utils'.
		//val content = VideoGenTransform.toM3U(_self, false, videos)
		//val playlist = _self.saveGeneratedModel(content)
		//_self.launchReader(playlist)
	}

	/**
	 * Saves the given playlist content in a temporary file (hashed by content)
	 * 
	 */
//	@Step
//	def private File saveGeneratedModel(String content) {
//		// Create the temporary file to receive playlist as M3U
//		val playlist = File.createTempFile(String.valueOf(content.hashCode), "-videogen.m3u")
//		val writer = new FileWriter(playlist)
//		writer.write(content)
//		writer.flush
//		writer.close
//		//_self.executionResult = playlist.toPath.toString
//		playlist
//	}

	/**
	 * Launches vlc instance with the provided playlist
	 * 
	 */
//	def private void launchReader(File playlist) {
//		// Start VLC
//		// TODO: add a new tab inside eclipse to start a video player...
//		// If possible (see Jave implementation from org.irisa.diverse.transformations.strategies)
//		val p = new ProcessBuilder("vlc", "--playlist-autostart", "--playlist-tree", "--no-overlay",
//			playlist.toPath.toString)
//		p.start()
//	}

	/**
	 * Adds a new expression to the objective of the linear system constraints
	 * 
	 * feature => bool * duration
	 * 
	 */
	def private void addVar(IntVar intvar, int duration, EList<Integer> constants, EList<IntVar> variables) {
		variables.add(intvar)
		constants.add(duration)
	}

	/**
	 * Constructs the Xor constraints from an Alternative
	 * 
	 * Result is :
	 * 		logOp = LogOp.xor(lastVar,
	 * 		LogOp.xor(...
	 * 			LogOp.xor(firstVar, secondVar)))
	 */
	def private void createAlternativesXorClause(Solver solver, EList<IntVar> vars) {
		var LogOp logOp = null
		var BoolVar firstVar = vars.head as BoolVar
		// Browse except the first element
		for (IntVar boolVar : vars.tail) {
			if (logOp == null) {
				logOp = LogOp.xor(firstVar, boolVar as BoolVar)
			} else {
				logOp = LogOp.xor(boolVar as BoolVar, logOp)
			}
		}
		SatFactory.addClauses(logOp, solver)
	}

	/**
	 * Creates a new feature for this Optional and adds it to the list
	 * 
	 */
	def private void createOptionalIntVar(Solver solver, Optional optional, EList<Integer> constants, EList<IntVar> variables) {
		var IntVar feature
		if (optional.active) {
			if (optional.selected) {
				feature = VariableFactory.fixed(optional.name, 1, solver)
			} else {
				feature = VariableFactory.bool(optional.name, solver)
			}
		} else {
			feature = VariableFactory.fixed(optional.name, 0, solver)
		}
		_self.addVar(feature, optional.video.duration, constants, variables)
	}
}

@Aspect(className=Transition)
abstract class TransitionAspect {

	public VideoGen videoGen = null
	public Boolean executed = false
	public Boolean callnextTransition = true
	private EMap<Integer, Double> distribution = new BasicEMap(1)
	private double distSum = 0

	def public void execute(VideoGen videoGen) {
	}

	/**
	 * This method is intended to be call by descendant of the Transition class while executing
	 * 
	 * DirtyFix to bypass the super execute from descendants
	 */
	def public void finishExecute(VideoGen videoGen) {
		// Stop invariant while looping the model
		if (_self.executed) {
			// Call the next sequence in all case
			if (_self.nextTransition !== null) {
				// Before calling next sequence, check that the object is an endpoint of its subgraph
				if (_self.callnextTransition) {
					_self.nextTransition.execute(videoGen)
				}
			}
		}
	}
	
	/**
	 * Configure the random number generator
	 * 
	 */
	def public void addNumber(int key, double distribution) {
		var double distnum = _self.distSum
		if (_self.distribution.contains(key)) {
			val value = _self.distribution.get(key).value
			if (value !== null) {
				distnum -= value
			}
		}
		_self.distribution.put(key, distribution)
		distnum += distribution
		_self.distSum = distnum
	}

	/**
	 * Generate a random number based of the configuration done with addNumber
	 * 
	 * Purge the numbers after use
	 */
	def public int getDistributedRandomNumber() {
		var double rand = Math.random()
		var double ratio = 1.0f / _self.distSum
		var double tempDist = 0
		for (Integer i : _self.distribution.keySet()) {
			tempDist += _self.distribution.get(i)
			if (rand / ratio <= tempDist) {
				return _self.sendAndPurgeResult(i)
			}

		}
		return _self.sendAndPurgeResult(0)
	}
	
	/**
	 * Helper method for random generator result sender
	 * 
	 * Purge the numbers added with addNumber method
	 * And return the value in parameters
	 */
	def private int sendAndPurgeResult(int i) {
		_self.distribution = new BasicEMap
		_self.distSum = 0
		return i
	}
	
}

@Aspect(className=Sequence)
abstract class SequenceAspect extends TransitionAspect {
}

@Aspect(className=Alternatives)
class AlternativesAspect extends SequenceAspect {

	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen vid) {

		// Selected is always true on Alternatives sequences
		// Optional could be linked together for alterantives management
		// A bind relation could be used to replace this data structure (maybe without common sense)
		_self.selected = true
		val selectedOption = _self.selectOption
		if (selectedOption != null) {
			selectedOption.selected = true
			_self.video = selectedOption.video

			// Manage optional next sequence if linked outside the alternatives
			// EDIT : for now the graph is not multipath friendly
			_self.options.filter[active].filter[video == _self.video].filter[nextTransition != null].forEach [
				nextTransition.execute(videoGen)
				// Call of nextTransition.process will not be called in super
				_self.callnextTransition = false
			]
		}
		// _self.super_execute(videoGen)
		_self.executed = true // Allow to execute next transition
		_self.finishExecute(vid)

	}
	/**
	 * Return a hashmap with corrected probabilities.
	 * 
	 */
	def private EMap<Optional, Integer> checkProbabilities() {
		val result = new BasicEMap<Optional, Integer>
		var totalProb = 0
		var totalProbLeft = 0
		var totalOptions = 0
		var inactivated = 0
		for (option : _self.options) {
			if (option.active) {
				if (option.probability == 0) {
					totalOptions++
				}
				totalProb += option.probability
				result.put(option, option.probability)
			} else {
				inactivated++
				totalProbLeft += option.probability
			}
		}
		if (result.size != 0) {
			if (result.size == 1) {
				val option = result.head.key
				result.clear
				result.put(option, 100)
			} else if (inactivated != 0) {
				for (name : result.keySet) {
					val percentageLeft = totalProbLeft / inactivated
					result.put(name, result.get(name) + percentageLeft)
				}
			} else {
				for (name : result.keySet) {
					if (result.get(name) == 0) {
						val percentageLeft = (100 - totalProb) / totalOptions
						result.put(name, percentageLeft)
					}
				}
			}
		}
		result as EMap<Optional, Integer>
	}

	/**
 	 * Process options to find the selectable video
 	 * 
 	 */
	def Optional selectOption() {

		val checkedProbabilities = _self.checkProbabilities
		if (checkedProbabilities.empty) {
			return null
		}
		checkedProbabilities.forEach[
			_self.addNumber(checkedProbabilities.indexOf(it), it.value)
		] 
		checkedProbabilities.get(_self.getDistributedRandomNumber()).key
	}
}

@Aspect(className=Mandatory)
class MandatoryAspect extends SequenceAspect {

	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen vid) {
		if (_self.active && !_self.executed) {
			_self.selected = true
		}
		// _self.super_execute(videoGen)
		_self.executed = true // Allow to execute next transition
		_self.finishExecute(vid)
	}
}

@Aspect(className=Optional)
class OptionalAspect extends SequenceAspect {

	/**
	 * Is this video is selectable or not ?
	 * applies 50% in case of undefined proba
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def private Boolean isSelected() {
		var float proba

		proba = 50
		if (_self.probability != 0) {
			proba = _self.probability
		}
		_self.addNumber(1, proba)
		_self.addNumber(0, 100 - proba)

		_self.getDistributedRandomNumber() > 0
	}

	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen vid) {
		if (_self.active && !_self.executed) {
			_self.selected = _self.isSelected
		}
		// _self.super_execute(videoGen)
		_self.executed = true // Allow to execute next transition
		_self.finishExecute(vid)
	}
}

@Aspect(className=Video)
class VideoAspect {

	@Step
	def public void setup() {
		if (!_self.url.startsWith("/")) {
			val workspace = ResourcesPlugin.workspace
			val project = workspace.root.projects.get(0)
			val uri = project.locationURI
			val prefix = uri.toString.replace("file:", "")
			val newPath = prefix + "/" + _self.url
			_self.setUrl(newPath)
		}
		// Add duration and VideoCodec MimeType
		// Using VideoGen properties based method to avoid type confusion
		val url = Paths.get(_self.url)
		_self.duration = VideosHelper.getDuration(url)
		val format = VideosHelper.getMimeType(url).format
		_self.mimetype = Mimetypes_Enum.getByName(format)
	}
}

@Aspect(className=Delay)
class DelayAspect extends TransitionAspect {
}

@Aspect(className=Initialize)
class InitializeAspect extends TransitionAspect {

	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen vid) {
		// _self.super_execute(videoGen)
		_self.executed = true // Allow to execute next transition
		_self.finishExecute(vid)
	}
}

@Aspect(className=Generate)
class GenerateAspect extends TransitionAspect {

	/**
	 * Call VideogGen.compute()
	 */
	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen vid) {
		if (!_self.executed) {
			VideoGenAspect.compute(vid)
		}
		// _self.super_execute(videoGen)
		_self.executed = true // Allow to execute next transition
		_self.finishExecute(vid)
	}
}
