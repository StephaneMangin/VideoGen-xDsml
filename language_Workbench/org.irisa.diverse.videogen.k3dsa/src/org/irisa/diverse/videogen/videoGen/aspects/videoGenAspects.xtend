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
    private int indice = 0
	public Map<Long, Map<String, Boolean>> allSolutions = newHashMap
	
	@Main
	def void main() {
		_self.execute
	}
	
	@Step
	def void solve() {
		// Define a new solver
    	_self.solver = new Solver("Min max durations constraints")
    	_self.indice = 0
    	_self.allSolutions = newHashMap
		if (_self.minUserConstraint > _self.maxUserConstraint || _self.maxUserConstraint == 0) {
			throw new Exception("You have to indicate a min and a max value")
		}
		val videoNumber = VideoGenHelper.allVideos(_self).size
		
		// Define the objective scalar with given contraints
		_self.objective = VariableFactory.bounded("objective", _self.minUserConstraint, _self.maxUserConstraint, _self.solver)
		_self.variables = newArrayOfSize(videoNumber) // Used to insert optional's coefficient
		_self.constants = newIntArrayOfSize(videoNumber) // Used to insert video durations. Must be a partition of coefs
				
		// Call the visitor
		_self.transitions.filter[it instanceof Sequence].filter[active].map[it as Sequence].forEach[solve]
		
		// Create and post constraints by using constraint factories
        _self.solver.post(IntConstraintFactory.scalar(_self.variables, _self.constants, _self.objective))
        // Launch the resolution process
        //solver.findOptimalSolution(ResolutionPolicy.SATISFACTION, objective)
        //solver.findOptimalSolution(ResolutionPolicy.MAXIMIZE, objective)
        //solver.findOptimalSolution(ResolutionPolicy.MINIMIZE, objective)
        _self.solver.findSolution
        // Print search statistics
        Chatterbox.printStatistics(_self.solver)
        // Print solutions
	    //log.info("Solutions selected " + variables.map[it.getName() + "=" + it.getValue()].join(", "))
        
        // Get all solutions
        val solutions = _self.solver.findAllSolutions
        log.info("Solutions max = " + solutions)
        _self.variantes = solutions.intValue
        var long i = 0
        do {
        	i++
		    log.info("- Solutions " + i)
		    val solution = newHashMap()
		    _self.variables.forEach[
		    	solution.put(it.name, it.value != 0 )
		    ]
		    _self.allSolutions.put(i, solution)
        } while (_self.solver.nextSolution())
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
		_self.transitions.forEach[it.setup(_self)]
		println("Setup end...")
		_self.configureDuration
				
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
	
	@InitializeModel
	def public void initializeModel(List<String> args){
		_self.setup
		log.info("Initialize model with " + args)
	}
	
	@Step
	def public Map<Long, Map<String, Boolean>> getSolutions() {
		_self.allSolutions
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
		_self.transitions.filter[selected].filter[it instanceof Sequence].map[it as Sequence].map[video].forEach[videos.put(name, true)]
		// TODO: Manage model transformation here
		// TODO: re-implement the initial IDM project model transformation. See master branch package 'fr.nemomen.utils'.
		val content = VideoGenTransform.toM3U(_self, false, videos)
		log.info("##### Videos computation result in M3U format : ")
		log.info(content)
		val playlist = _self.saveGeneratedModel(content)
		//_self.launchReader(playlist)
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
		val p = new ProcessBuilder(
			"vlc",
			"--playlist-autostart",
			"--playlist-tree",
			"--no-overlay",
			playlist.toPath.toString)
		p.start()
	}
	
	@Step
	def private void configureDuration() {
		_self.transitions
			.filter[it instanceof Sequence]
			.map[it as Sequence]
			.forEach[configureDuration(_self)]
	}
	
	/**
	 * Add a new expression to the objective
	 * 
	 * feature => bool * duration
	 * 
	 */
	@Step
	def void addVar(IntVar intvar, int duration) {
		_self.variables.set(_self.indice, intvar)
		_self.constants.set(_self.indice, duration)
		_self.indice = _self.indice + 1
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
				//Don't forget to reset current state
				_self.executed = true
				// Before calling next sequence, check that the object is an endpoint of its subgraph
				if (_self.callnextTransition) {
					_self.nextTransition.execute(videoGen)
				}
			}
		}
	}
	
	@Step
	def void setup(VideoGen vid) {
		println("Setup transition...")
		_self.selected = false
		_self.active = true
		_self.executed = false
		_self.videoGen = vid
		if (_self instanceof Sequence) {
			(_self as Sequence).setup(vid)
		}
	}
}


@Aspect(className=Sequence)
abstract class SequenceAspect extends TransitionAspect {

	@Step
	def public void setup() {
		println("Setup sequence...")
		if (_self instanceof Alternatives) {
			_self.options.forEach[opt |
				opt.selected = false
				opt.active = true
				opt.executed = false
				opt.videoGen = _self.videoGen
			]
		}
		_self.video.setup
	}
	
	@Step
	def void configureDuration() {
		if (_self.active) {
			if (_self instanceof Mandatory) {
				(_self as Mandatory).configureDuration
			} else if (_self instanceof Optional) {
				(_self as Optional).configureDuration
			} else if (_self instanceof Alternatives) {
				(_self as Alternatives).configureDuration
			}
		}
	}
	
	@Step
	def void solve() {
		if (_self instanceof Optional) {
			_self.solve
		} else if (_self instanceof Mandatory) {
			_self.solve
		} else if (_self instanceof Alternatives) {
			_self.solve
		}
	}
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
			_self.options
				.filter[active]
				.filter[video == _self.video]
				.filter[nextTransition != null]
				.forEach[ 
					nextTransition.execute(videoGen)
					// Call of nextTransition.process will not be called in super
					_self.callnextTransition = false
			]
		}
		//_self.super_execute(videoGen)
		_self.finishExecute(vid)
		
	}
	
	@Step
	def void configureDuration() {
		var List<Integer> durations = _self.options.map[video.duration]
		durations = _self.options.filter[selected].map[video.duration].toList
		_self.videoGen.minDurationConstraint = _self.videoGen.minDurationConstraint + durations.min
		_self.videoGen.maxDurationConstraint = _self.videoGen.maxDurationConstraint + durations.max
		_self.videoGen.variantes = _self.videoGen.variantes * _self.options.filter[active].size
	}
	
	@Step
	def void solve() {
		// Local vars
		val optionsSize = _self.options.size
		val localVars = newArrayList()
		var localCount = 0
		
		// Effective parse to inject a feature for each option
		for (Optional opt: _self.options) {
			val feature = opt.solve
			localVars.set(localCount, feature)
			localCount++
		}
		
		// Create and insert the xor clause
		val logOp = _self.createAlternativesXorClause(localVars)
		SatFactory.addClauses(logOp, _self.videoGen.solver)
	}
	
	/*
	 * Constructs the Xor constraints from an Alternative
	 * 
	 * Result is :
	 * 		logOp = LogOp.xor(lastVar,
	 *			LogOp.xor(...
	 *				LogOp.xor(firstVar, secondVar)))
	 */
	@Step
	def private LogOp createAlternativesXorClause(List<IntVar> vars) {
		var LogOp logOp = null
		var BoolVar firstVar = vars.head  as BoolVar
		// Browse except the first element

		for (IntVar boolVar: vars.tail) {
			if (logOp == null) {
				logOp = LogOp.xor(firstVar, boolVar as BoolVar)
			} else {
				logOp = LogOp.xor(boolVar as BoolVar, logOp)
			}
		}
		logOp
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
		//_self.super_execute(videoGen)

		_self.finishExecute(vid)
	}
	
	@Step
	def void configureDuration() {
		_self.videoGen.minDurationConstraint = _self.videoGen.minDurationConstraint + _self.video.duration
		_self.videoGen.maxDurationConstraint = _self.videoGen.maxDurationConstraint + _self.video.duration
	}
		
	@Step
	def void solve() {
		// A mandatory has a fixed coef value of 1, mandatory right ;)
		val feature = VariableFactory.fixed(_self.name, 1, _self.videoGen.solver)
		_self.videoGen.addVar(feature, _self.video.duration)
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
		//_self.super_execute(videoGen)

		_self.finishExecute(vid)
	}
	
	@Step
	def void configureDuration() {
		_self.videoGen.minDurationConstraint = _self.videoGen.minDurationConstraint + _self.video.duration
		_self.videoGen.variantes = _self.videoGen.variantes * 2
	}
	
	@Step
	def IntVar solve() {
		// For choco, a bool is a integer between 0 and 1
		var IntVar feature
		if (_self.active) {	
			if (_self.selected) {
				feature = VariableFactory.fixed(_self.name, 1, _self.videoGen.solver)
			} else {
				feature = VariableFactory.bool(_self.name, _self.videoGen.solver)
			}
		} else {
			feature = VariableFactory.fixed(_self.name, 0, _self.videoGen.solver)
		}
		_self.videoGen.addVar(feature, _self.video.duration)
		feature
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
		//_self.super_execute(videoGen)

		_self.finishExecute(vid)
	}

}
