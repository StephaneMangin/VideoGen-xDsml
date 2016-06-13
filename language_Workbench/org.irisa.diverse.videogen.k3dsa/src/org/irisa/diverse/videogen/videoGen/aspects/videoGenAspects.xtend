package org.irisa.diverse.videogen.videoGen.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.io.File
import java.io.FileWriter
import java.nio.file.Path
import java.nio.file.Paths
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.logging.FileHandler
import java.util.logging.Logger
import java.util.logging.SimpleFormatter
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.IntConstraintFactory
import org.chocosolver.solver.trace.Chatterbox
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VariableFactory
import org.chocosolver.solver.constraints.SatFactory
import org.eclipse.core.resources.ResourcesPlugin
import org.irisa.diverse.videogen.transformations.VideoGenTransform
import org.irisa.diverse.videogen.transformations.helpers.SystemHelper
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.transformations.utils.DistributedRandomNumberGenerator
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
import static extension org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.TransitionAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.VideoAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.OptionalAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.MandatoryAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspect.*
import org.chocosolver.solver.constraints.nary.cnf.LogOp
import org.chocosolver.solver.variables.BoolVar

@Aspect(className=VideoGen)
class VideoGenAspect {

	private long nanotimeStart = 0
	private long nanotimeEnd = 0
	protected static Logger log = Logger.getLogger("VideoGenAspect")
	private static Path workspacePath = Paths.get(ResourcesPlugin.workspace.root.projects.get(0).locationURI)
	private static Path logPath = Paths.get(workspacePath + "/logs")
	private List<IntVar> variables
	private List<Integer> constants
	public Solver solver = new Solver("Min max durations constraints")
	private IntVar objective
	private int featureIndex = 0
	public Map<Long, Map<String, Boolean>> allSolutions = newHashMap

	@Main
	def void main() {
		_self.execute
	}

	/**
	 * This method generates a linear system to satisfy the min and max user constraints
	 * 
	 */
	@Step
	def void solve() {
		// Define a new solver
		_self.solver = new Solver("Min max durations constraints")
		_self.featureIndex = 0
		_self.allSolutions = newHashMap
		// if (_self.minUserConstraint > _self.maxUserConstraint || _self.maxUserConstraint == 0) {
		// throw new Exception("You have to indicate a min and a max value")
		// }
		val videoNumber = VideoGenHelper.allVideos(_self).size

		// Define the objective scalar with given contraints
		_self.objective = VariableFactory.bounded("objective", 46000, // _self.minUserConstraint,
		110000, // _self.maxUserConstraint,
		_self.solver)
		_self.variables = newArrayOfSize(videoNumber) // Used to insert optional's coefficient
		_self.constants = newIntArrayOfSize(videoNumber) // Used to insert video durations
		// Call the visitor
		_self.transitions.forEach [

			if (it instanceof Mandatory) {
				// A mandatory has a fixed coef value of 1, mandatory right ;)
				val feature = VariableFactory.fixed(it.name, 1, _self.solver)
				_self.addVar(feature, it.video.duration)

			} else if (it instanceof Optional) {
				// For choco, a bool is a integer between 0 and 1
				_self.createOptionalIntVar(it)

			} else if (it instanceof Alternatives) {
				// Local vars
				val optionsSize = it.options.size
				val localVars = newArrayOfSize(optionsSize)
				var localCount = 0

				// Effective parse to inject a feature for each option
				for (Optional opt : it.options) {
					_self.createOptionalIntVar(opt)
					localVars.set(localCount, _self.getCurrentVar())
					localCount++
				}

				// Create and insert the xor clause
				_self.createAlternativesXorClause(localVars)
			}
		]

		// Create and post constraints by using constraint factories
		_self.solver.post(IntConstraintFactory.scalar(_self.variables, _self.constants, _self.objective))
		// Launch the resolution process
		// solver.findOptimalSolution(ResolutionPolicy.SATISFACTION, objective)
		// solver.findOptimalSolution(ResolutionPolicy.MAXIMIZE, objective)
		// solver.findOptimalSolution(ResolutionPolicy.MINIMIZE, objective)
		
		val solutionUnique = _self.solver.findSolution()
		if(solutionUnique) {
			// Print search statistics
			Chatterbox.printStatistics(_self.solver)
			println(_self.solver)
			// Print solutions
			// log.info("Solutions selected " + variables.map[it.getName() + "=" + it.getValue()].join(", "))
			// Get all solutions
			var long i = 0
			do {
				i++
				log.info("- Solutions " + i)
				val solution = newHashMap()
				_self.variables.forEach [
					solution.put(it.name, it.value != 0)
				]
				_self.allSolutions.put(i, solution)
				_self.variantes = _self.variantes + 1
			} while (_self.solver.nextSolution())
			
		} else if(_self.solver.hasReachedLimit()){
		    System.out.println("The could not find a solution
		                        nor prove that none exists in the given limits");
		} else {
		    System.out.println("The solver has proved the problem has no solution");
		}	
	}

	def void createOptionalIntVar(Optional optional) {
		var IntVar feature
		if (optional.active) {
			if (optional.selected) {
				feature = VariableFactory.fixed(optional.name, 1, _self.solver)
			} else {
				feature = VariableFactory.bool(optional.name, _self.solver)
			}
		} else {
			feature = VariableFactory.fixed(optional.name, 0, _self.solver)
		}
		_self.addVar(feature, optional.video.duration)
	}

	/**
	 * This method is intended to configure the model
	 * Called by the initializeModel method
	 * 
	 */
	@Step
	def private void setup() {
		val start = System.nanoTime
		println("Setup start...")

		// Durations calculation
		_self.transitions.forEach [
			it.selected = false
			it.active = true
			it.executed = false
			it.videoGen = videoGen
			if (it instanceof Alternatives) {
				var List<Integer> durations = it.options.map[video.duration]
				// durations = _self.options.filter[selected].map[video.duration]
				_self.minDurationConstraint = (_self.minDurationConstraint + durations.min)
				_self.maxDurationConstraint = (_self.maxDurationConstraint + durations.max)
				_self.variantes = (_self.variantes * it.options.filter[active].size)
				it.options.forEach [ opt |
					opt.selected = false
					opt.active = true
					opt.executed = false
					opt.videoGen = videoGen
				]
			} else if (it instanceof Mandatory) {
				_self.minDurationConstraint = (_self.minDurationConstraint + it.video.duration)
				_self.maxDurationConstraint = (_self.maxDurationConstraint + it.video.duration)
			} else if (it instanceof Optional) {
				_self.maxDurationConstraint = (_self.maxDurationConstraint + it.video.duration)
				_self.variantes = (_self.variantes * 2)
			}
		]
		// Video specific setup
		_self.videos.forEach[it.setup]

		// Visitors calls to populate model mutables
		_self.minUserConstraint = _self.minDurationConstraint
		_self.maxUserConstraint = _self.maxDurationConstraint

		// Log definition
		SystemHelper.mkDirs(logPath)
		val FileHandler fh = new FileHandler(logPath + "/" + log.name + ".log", true)
		val formatter = new SimpleFormatter()
		fh.setFormatter(formatter)
		log.addHandler(fh)

		log.info("#### VideoGen, time to setup " + (System.nanoTime - start))

	}

	@Step
	@InitializeModel
	def public void initializeModel(List<String> args) {
		_self.setup
		log.info("Initialize model with " + args)
	}

	@Step
	def public void execute() {
		_self.nanotimeStart = System.nanoTime
		_self.solve
		// Process each transitions, starting with the Initialize
		VideoGenHelper.getInitialize(_self).execute(_self)
		_self.nanotimeEnd = System.nanoTime
		log.info("#### VideoGen, time to execute " + (_self.nanotimeEnd - _self.nanotimeStart))
	}

	/**
	 * Start the computation (model transformation) of all selected video
	 * to create the final sequence (PlayList format)
	 * 
	 */
	@Step
	def public void compute() {
		val videos = new HashMap
		log.info("##### VideoGen '" + _self.name + "' start computation.")
		_self.transitions.filter[selected].filter[it instanceof Sequence].map[it as Sequence].map[video].forEach [
			videos.put(name, true)
		]
		// TODO: Manage model transformation here
		// TODO: re-implement the initial IDM project model transformation. See master branch package 'fr.nemomen.utils'.
		val content = VideoGenTransform.toM3U(_self, false, videos)
		log.info("##### Videos computation result in M3U format : ")
		log.info(content)
		val playlist = _self.saveGeneratedModel(content)
	// _self.launchReader(playlist)
	}

	/**
	 * Save the given playlist content in a temporary file (hashed by content)
	 * 
	 */
	def private File saveGeneratedModel(String content) {
		// Create the temporary file to receive playlist as M3U
		val playlist = File.createTempFile(String.valueOf(content.hashCode), "-videogen.m3u")
		val writer = new FileWriter(playlist)
		writer.write(content)
		writer.flush
		writer.close
		playlist
	}

	/**
	 * Launch vlc instance with the provided playlist
	 * 
	 */
	def private void launchReader(File playlist) {
		// Start VLC
		// TODO: add a new tab inside eclipse to start a video player...
		// If possible (see Jave implementation from org.irisa.diverse.transformations.strategies)
		val p = new ProcessBuilder("vlc", "--playlist-autostart", "--playlist-tree", "--no-overlay",
			playlist.toPath.toString)
		p.start()
	}

	/**
	 * Add a new expression to the objective of the linear system constraints
	 * 
	 * feature => bool * duration
	 * 
	 */
	@Step
	def void addVar(IntVar intvar, int duration) {
		_self.variables.set(_self.featureIndex, intvar)
		_self.constants.set(_self.featureIndex, duration)
		_self.featureIndex = _self.featureIndex + 1
	}

	/**
	 * Get the last added feature
	 * 
	 */
	@Step
	def IntVar getCurrentVar() {
		_self.variables.get(_self.featureIndex - 1)
	}

	/*
	 * Constructs the Xor constraints from an Alternative
	 * 
	 * Result is :
	 * 		logOp = LogOp.xor(lastVar,
	 * 		LogOp.xor(...
	 * 			LogOp.xor(firstVar, secondVar)))
	 */
	@Step
	def public void createAlternativesXorClause(List<IntVar> vars) {
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
		SatFactory.addClauses(logOp, _self.solver)
	}
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
		VideoGenAspect.log.info("##### '" + _self + "' is being processed.")

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
		val selectedOption = VideoGenHelper.selectOption(_self)
		if (selectedOption != null) {
			selectedOption.selected = true
			_self.video = selectedOption.video
			VideoAspect.select(_self.video)

			// Manage optional next sequence if linked outside the alternatives
			// EDIT : for now the graph is not multipath friendly
			_self.options.filter[active].filter[video == _self.video].filter[nextTransition != null].forEach [
				nextTransition.execute(videoGen)
				// Call of nextTransition.process will not be called in super
				_self.callnextTransition = false
			]
		}
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
			VideoAspect.select(_self.video)
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

		var drng = new DistributedRandomNumberGenerator()

		var float proba

		proba = 50
		if (_self.probability != 0) {
			proba = _self.probability
		}
		drng.addNumber(1, proba)
		drng.addNumber(0, 100 - proba)

		drng.getDistributedRandomNumber() > 0
	}

	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen vid) {
		if (_self.active && !_self.executed) {
			if (_self.isSelected()) {
				VideoAspect.select(_self.video)
				_self.selected = true
			}
		}
		// _self.super_execute(videoGen)
		_self.finishExecute(vid)
	}
}

@Aspect(className=Video)
class VideoAspect {

	/**
	 * Select this video and apply any of needed operations (conversion or rename for example)
	 * 
	 */
	@Step
	def public void select() {
		VideoGenAspect.log.info(_self.toString)
		if (!_self.url.startsWith("/")) {
			val prefix = ResourcesPlugin.workspace.root.projects.get(0).locationURI.toString.replace("file:", "")
			val newPath = prefix + "/" + _self.url
			VideoGenAspect.log.info(_self.url + "=>" + newPath)
			_self.url = newPath
		}
		// Add duration and VideoCodec MimeType
		VideoGenTransform.addMetadata(_self)

		// It's bad to call the aspect class but easier than giving an attribute to the method signature
		VideoGenAspect.log.info("##### Video '" + _self.name + "' has been selected.")
	}

	@Step
	def public void setup() {
		if (!_self.url.startsWith("/")) {
			val prefix = ResourcesPlugin.workspace.root.projects.get(0).locationURI.toString.replace("file:", "")
			val newPath = prefix + "/" + _self.url
			_self.setUrl(newPath)
		}
		// Add duration and VideoCodec MimeType
		VideoGenTransform.addMetadata(_self)
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
