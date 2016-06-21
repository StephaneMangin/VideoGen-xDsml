package org.irisa.diverse.videogen.videoGen.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.HashMap
import java.util.List
import java.util.Map
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Delay
import org.irisa.diverse.videogen.videoGen.Generate
import org.irisa.diverse.videogen.videoGen.Initialize
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen

import static extension org.irisa.diverse.videogen.videoGen.aspects.TransitionAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.VideoAspect.*

@Aspect(className=VideoGen)
class VideoGenAspect {

	private Boolean initialized = false
//	private List<IntVar> variables
	private List<Integer> constants
//	private IntVar objective
	private int featureIndex = 0

	@Main
	def void main() {
		_self.execute
	}

	/**
	 * This method generates a linear model to satisfy the min and max user constraints
	 * 
	 */
	@Step
	def Map<Long, Integer> solve() {
				
//		val solver = new Solver("Min max durations constraints")
//		_self.featureIndex = 0
		val allSolutions = newHashMap
//		// if (_self.minUserConstraint > _self.maxUserConstraint || _self.maxUserConstraint == 0) {
//		// throw new Exception("You have to indicate a min and a max value")
//		// }
//		val videoNumber = VideoGenHelper.allVideos(_self).size
//
//		// Define the objective scalar with given contraints
//		_self.objective = VariableFactory.bounded(
//			"objective",
//			_self.minUserConstraint,
//			_self.maxUserConstraint,
//			solver)
//		_self.variables = newArrayOfSize(videoNumber) // Used to insert optional's coefficient
//		_self.constants = newIntArrayOfSize(videoNumber) // Used to insert video durations
//		// Call the visitor
//		_self.transitions.forEach [
//
//			if (it instanceof Mandatory) {
//				// A mandatory has a fixed coef value of 1, mandatory right ;)
//				val feature = VariableFactory.fixed(it.name, 1, solver)
//				_self.addVar(feature, it.video.duration)
//
//			} else if (it instanceof Optional) {
//				// For choco, a bool is a integer between 0 and 1
//				_self.createOptionalIntVar(solver, it)
//
//			} else if (it instanceof Alternatives) {
//				// Local vars
//				val optionsSize = it.options.size
//				val localVars = newArrayOfSize(optionsSize)
//				var localCount = 0
//
//				// Effective parse to inject a feature for each option
//				for (Optional opt : it.options) {
//					_self.createOptionalIntVar(solver,opt)
//					localVars.set(localCount, _self.getCurrentVar())
//					localCount++
//				}
//
//				// Create and insert the xor clause
//				_self.createAlternativesXorClause(solver,localVars)
//			}
//		]
//
//		// Create and post constraints by using constraint factories
//		solver.post(IntConstraintFactory.scalar(_self.variables, _self.constants, _self.objective))
//		// Launch the resolution process
//		// solver.findOptimalSolution(ResolutionPolicy.SATISFACTION, objective)
//		// solver.findOptimalSolution(ResolutionPolicy.MAXIMIZE, objective)
//		// solver.findOptimalSolution(ResolutionPolicy.MINIMIZE, objective)
//		
//		val solutionUnique = solver.findSolution()
//		if(solutionUnique) {
//			// Print search statistics
//			Chatterbox.printStatistics(solver)
//			println(solver)
//			// Get all solutions
//			var long i = 0
//			do {
//				i++
//				for (intvar: _self.variables) {
//					val index = _self.variables.indexOf(intvar)
//					if (allSolutions.get(i) == null) {
//						allSolutions.put(i, 0)
//					}
//					allSolutions.put(i, allSolutions.get(i) + (intvar.value * _self.constants.get(index)))
//				}
//				_self.variantes = _self.variantes + 1
//			} while (solver.nextSolution())
//			println("Total solutions => " + i)
//			
//		} else if(solver.hasReachedLimit()){
//		    println("The could not find a solution nor prove that none exists in the given limits");
//		} else {
//		    println("The solver has proved the problem has no solution");
//		}
//		println(allSolutions)
		allSolutions
	}

//	def void createOptionalIntVar(Solver solver, Optional optional) {
//		var IntVar feature
//		if (optional.active) {
//			if (optional.selected) {
//				feature = VariableFactory.fixed(optional.name, 1, solver)
//			} else {
//				feature = VariableFactory.bool(optional.name, solver)
//			}
//		} else {
//			feature = VariableFactory.fixed(optional.name, 0, solver)
//		}
//		_self.addVar(feature, optional.video.duration)
//	}

	/**
	 * This method is intended to configure the model
	 * Called by the initializeModel method
	 * 
	 */
	@Step
	def private void setup() {
		println("Setup start...")

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
			it.videoGen = videoGen
			if (it instanceof Alternatives) {
				var List<Integer> durations = it.options.map[video.duration]
				// durations = _self.options.filter[selected].map[video.duration]
				results.put("min", results.get("min") + durations.min)
				results.put("max", results.get("max") + durations.max)
				results.put("variants", results.get("variants") * it.options.size)
				it.options.forEach [ opt |
					opt.selected = false
					opt.active = true
					opt.executed = false
					opt.videoGen = videoGen
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
	}

	@Step
	@InitializeModel
	def public void initializeModel(List<String> args) {
		_self.setup
		_self.initialized = true
	}

	@Step
	def public void execute() {
		_self.solve
		// Process each transitions, starting with the Initialize
		_self.transitions.filter[it instanceof Initialize].map[it as Initialize].head.execute(_self)
	}

	/**
	 * Start the computation (model transformation) of all selected video
	 * to create the final sequence (PlayList format)
	 * 
	 */
	@Step
	def public void compute() {
		val videos = new HashMap
		_self.transitions.filter[selected].filter[it instanceof Sequence].map[it as Sequence].map[video].forEach [
			videos.put(name, true)
		]
		// TODO: Manage model transformation here
		// TODO: re-implement the initial IDM project model transformation. See master branch package 'fr.nemomen.utils'.
		//val content = VideoGenTransform.toM3U(_self, false, videos)
		//println("##### Videos computation result in M3U format : ")
		//println(content)
		//val playlist = _self.saveGeneratedModel(content)
	// _self.launchReader(playlist)
	}

	/**
	 * Save the given playlist content in a temporary file (hashed by content)
	 * 
	 */
//	def private File saveGeneratedModel(String content) {
//		// Create the temporary file to receive playlist as M3U
//		val playlist = File.createTempFile(String.valueOf(content.hashCode), "-videogen.m3u")
//		val writer = new FileWriter(playlist)
//		writer.write(content)
//		writer.flush
//		writer.close
//		playlist
//	}

	/**
	 * Launch vlc instance with the provided playlist
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
	 * Add a new expression to the objective of the linear system constraints
	 * 
	 * feature => bool * duration
	 * 
	 */
//	@Step
//	def void addVar(IntVar intvar, int duration) {
//		_self.variables.set(_self.featureIndex, intvar)
//		_self.constants.set(_self.featureIndex, duration)
//		_self.featureIndex = _self.featureIndex + 1
//	}

	/**
	 * Get the last added feature
	 * 
	 */
//	@Step
//	def IntVar getCurrentVar() {
//		_self.variables.get(_self.featureIndex - 1)
//	}

	/*
	 * Constructs the Xor constraints from an Alternative
	 * 
	 * Result is :
	 * 		logOp = LogOp.xor(lastVar,
	 * 		LogOp.xor(...
	 * 			LogOp.xor(firstVar, secondVar)))
	 */
//	@Step
//	def public void createAlternativesXorClause(Solver solver, List<IntVar> vars) {
//		var LogOp logOp = null
//		var BoolVar firstVar = vars.head as BoolVar
//		// Browse except the first element
//		for (IntVar boolVar : vars.tail) {
//			if (logOp == null) {
//				logOp = LogOp.xor(firstVar, boolVar as BoolVar)
//			} else {
//				logOp = LogOp.xor(boolVar as BoolVar, logOp)
//			}
//		}
//		SatFactory.addClauses(logOp, solver)
//	}
}

@Aspect(className=Transition)
abstract class TransitionAspect {

	public VideoGen videoGen = null
	public Boolean executed = false
	public Boolean callnextTransition = true

	@Step
	def public void execute(VideoGen videoGen) {
	}

	/**
	 * This method is intended to be call by descendant of the Transition class while executing
	 * 
	 * DirtyFix to bypass the super execute from descendants
	 */
	@Step
	def public void finishExecute(VideoGen videoGen) {
		// Stop invariant while looping the model
		if (!_self.executed) {
			// Call the next sequence in all case
			if (_self.nextTransition !== null) {
				// Don't forget to reset current state
				_self.executed = true
				// Before calling next sequence, check that the object is an endpoint of its subgraph
				if (_self.callnextTransition) {
					_self.nextTransition.execute(videoGen)
				}
			}
		}
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
//		val selectedOption = _self.selectOption
//		if (selectedOption != null) {
//			selectedOption.selected = true
//			_self.video = selectedOption.video
//
//			// Manage optional next sequence if linked outside the alternatives
//			// EDIT : for now the graph is not multipath friendly
//			_self.options.filter[active].filter[video == _self.video].filter[nextTransition != null].forEach [
//				nextTransition.execute(videoGen)
//				// Call of nextTransition.process will not be called in super
//				_self.callnextTransition = false
//			]
//		}
		// _self.super_execute(videoGen)
		_self.finishExecute(vid)

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

//		var drng = new DistributedRandomNumberGenerator()
//
//		var float proba
//
//		proba = 50
//		if (_self.probability != 0) {
//			proba = _self.probability
//		}
//		drng.addNumber(1, proba)
//		drng.addNumber(0, 100 - proba)
//
//		drng.getDistributedRandomNumber() > 0
		true
	}

	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen vid) {
		if (_self.active && !_self.executed) {
			_self.selected = _self.isSelected
		}
		// _self.super_execute(videoGen)
		_self.finishExecute(vid)
	}
}

@Aspect(className=Video)
class VideoAspect {

	@Step
	def public void setup() {
		if (!_self.url.startsWith("/")) {
//			val workspace = ResourcesPlugin.workspace
//			val project = workspace.root.projects.get(0)
//			val uri = project.locationURI
//			val prefix = uri.toString.replace("file:", "")
//			val newPath = prefix + "/" + _self.url
//			_self.setUrl(newPath)
		}
		// Add duration and VideoCodec MimeType
		//VideoGenTransform.addMetadata(_self)
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
		_self.finishExecute(vid)
	}
}
