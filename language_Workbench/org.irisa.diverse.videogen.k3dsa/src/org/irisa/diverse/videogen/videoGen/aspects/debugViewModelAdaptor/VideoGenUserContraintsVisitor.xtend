package org.irisa.diverse.videogen.videoGen.aspects.debugViewModelAdaptor

import java.util.Map
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.IntConstraintFactory
import org.chocosolver.solver.trace.Chatterbox
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VariableFactory
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.VideoGen

class VideoGenUserContraintsVisitor {
	
	private IntVar[] variables
	private int[] constants
    private Solver solver
    private IntVar objective
    private int indice
	public Map<Long, Map<String, Boolean>> allSolutions
    
    new() {
		// Define a new solver
    	solver = new Solver("Min max durations constraints")
    	indice = 0
    }
    
	def void visit(VideoGen vid) {
		visit(vid, vid.minDurationConstraint, vid.maxDurationConstraint)
	}
	def void visit(VideoGen vid, int min, int max) {// Define a new solver
    	solver = new Solver("Min max durations constraints")
    	indice = 0
		if (min > max || max == 0) {
			throw new Exception("You have to indicate a min and a max value")
		}
		val videoNumber = 0//VideoGenHelper.allVideos(vid).size
		
		// Define the objective scalar with given contraints
		objective = VariableFactory.bounded("objective", min, max, solver)
		variables = newArrayOfSize(videoNumber) // Used to insert optional's coefficient
		constants = newIntArrayOfSize(videoNumber) // Used to insert video durations. Must be a partition of coefs
				
		// Call the visitor		
		// Create and post constraints by using constraint factories
        solver.post(IntConstraintFactory.scalar(variables, constants, objective))
        // Launch the resolution process
        //solver.findOptimalSolution(ResolutionPolicy.SATISFACTION, objective)
        //solver.findOptimalSolution(ResolutionPolicy.MAXIMIZE, objective)
        //solver.findOptimalSolution(ResolutionPolicy.MINIMIZE, objective)
        solver.findAllSolutions
        solver.findSolution
        // Print search statistics
        Chatterbox.printStatistics(solver)
        // Print solutions
	    //log.info("Solutions selected " + variables.map[it.getName() + "=" + it.getValue()].join(", "))
        
        // Get all solutions
        val solutions = solver.findAllSolutions
        vid.variantes = solutions.intValue
        var long i = 0
        do {
        	i++
		    val solution = newHashMap()
		    variables.forEach[
		    	solution.put(it.name, it.value != 0 )
		    ]
		    allSolutions.put(i, solution)
        } while (solver.nextSolution())
	
	}


	
	def void applyConstraints(VideoGen vid) {
		//VideoGenHelper.allSequences(vid).filter[active].forEach[applyConstraints]
	}
	/**
	 * Modify the model in conformity of the solver results
	 * 
	 */
	def void applyConstraints(Sequence tra) {
		if (tra instanceof Optional) {
			tra.applyConstraints
		} else if (tra instanceof Alternatives) {
			tra.applyConstraints
		}
	}
	
	/**
	 * Modify the model in conformity of the solver results
	 * 
	 */
	def void applyConstraints(Alternatives alt) {
		alt.options.forEach[applyConstraints]
	}
	
	/**
	 * Modify the model in conformity of the solver results
	 * 
	 */
	def void applyConstraints(Optional opt) {
		if (variables.filter[value == 0].exists[name == opt.name]) {
			opt.active = false
		}
	}
	
}
