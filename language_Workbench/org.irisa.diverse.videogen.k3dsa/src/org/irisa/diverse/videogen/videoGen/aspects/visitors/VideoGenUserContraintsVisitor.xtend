package org.irisa.diverse.videogen.videoGen.aspects.visitors

import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.IntConstraintFactory
import org.chocosolver.solver.trace.Chatterbox
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VariableFactory
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.aspects.utils.LoggableVisitor
import org.chocosolver.solver.constraints.SatFactory
import org.chocosolver.solver.ResolutionPolicy
import org.chocosolver.solver.constraints.nary.cnf.LogOp
import org.chocosolver.solver.variables.BoolVar

class VideoGenUserContraintsVisitor extends LoggableVisitor {
	
	private IntVar[] variables
	private int[] constants
    private Solver solver
    private IntVar objective
    private int indice
    
    new() {
		// Define a new solver
    	solver = new Solver("Min max durations constraints")
    	indice = 0
    }
    
	def visit(VideoGen vid, int min, int max) {
		if (min > max || max == 0) {
			throw new Exception("You have to indicate a min and a max value")
		}
		val videoNumber = VideoGenHelper.allVideos(vid).size
		
		// Define the objective scalar with given contraints
		objective = VariableFactory.bounded("objective", min, max, solver)
		variables = newArrayOfSize(videoNumber) // Used to insert optional's coefficient
		constants = newIntArrayOfSize(videoNumber) // Used to insert video durations. Must be a partition of coefs
		
		log.info("VideoGen User Contraints Visitor started...")
		log.info("\t => minConstraint=" + min + ", maxConstraint=" + max)
		
		// Call the visitor
		VideoGenHelper.allSequences(vid).filter[active].forEach[visit]
		
		// Create and post constraints by using constraint factories
        solver.post(IntConstraintFactory.scalar(variables, constants, objective))
        log.info(solver.toString())
        // Launch the resolution process
        //solver.findOptimalSolution(ResolutionPolicy.SATISFACTION, objective)
        //solver.findOptimalSolution(ResolutionPolicy.MAXIMIZE, objective)
        //solver.findOptimalSolution(ResolutionPolicy.MINIMIZE, objective)
        //solver.findAllSolutions
        solver.findSolution
        // Print search statistics
        Chatterbox.printStatistics(solver)
        // Print solutions
	    //log.info("Solutions selected " + variables.map[it.getName() + "=" + it.getValue()].join(", "))
        
        // Then apply constraints
		VideoGenHelper.allSequences(vid).filter[active].forEach[applyConstraints]
        
        // Get all solutions
//        val solutions = solver.findAllSolutions
//        log.info("Solutions max = " + solutions)
//        vid.variantes = solutions.intValue
//        var i = 0
//        do {
//        	i++
//		    log.info("- Solutions " + i)
//		    for (IntVar coef: variables) {
//		    	log.info("\t" + variables.map[it.getName() + "=" + it.getValue()].join(", "))
//		    }
//        } while (solver.nextSolution())
	}
	
	def private void visit(Sequence tra) {
		if (tra instanceof Optional) {
			tra.visit
		} else if (tra instanceof Mandatory) {
			tra.visit
		} else if (tra instanceof Alternatives) {
			tra.visit
		}
	}
		
	def private visit(Alternatives alt) {
		// Local vars
		val optionsSize = alt.options.size
		val localVars = newArrayOfSize(optionsSize)
		var localCount = 0
		
		// Effective parse to inject a feature for each option
		for (Optional opt: alt.options) {
			val feature = opt.visit
			localVars.set(localCount, feature)
			localCount++
		}
		
		// Create and insert the xor clause
		val logOp = createAlternativesXorClause(localVars)
		SatFactory.addClauses(logOp, solver)
	}
	
	def private IntVar visit(Optional opt) {
		// For choco, a bool is a integer between 0 and 1
		var IntVar feature
		if (opt.active) {	
			if (opt.selected) {
				feature = VariableFactory.fixed(opt.name, 1, solver)
			} else {
				feature = VariableFactory.bool(opt.name, solver)
			}
		} else {
			feature = VariableFactory.fixed(opt.name, 0, solver)
		}
		addVar(feature, opt.video.duration)
		feature
	}
	
	def private visit(Mandatory man) {
		// A mandatory has a fixed coef value of 1, mandatory right ;)
		val feature = VariableFactory.fixed(man.name, 1, solver)
		addVar(feature, man.video.duration)
	}
	
	/**
	 * Add a new expression to the objective
	 * 
	 * feature => bool * duration
	 * 
	 */
	def private void addVar(IntVar intvar, int duration) {
		variables.set(indice, intvar)
		constants.set(indice, duration)
		indice++
	}
	
	/*
	 * Constructs the Xor constraints from an Alternative
	 * 
	 * Result is :
	 * 		logOp = LogOp.xor(lastVar,
	 *			LogOp.xor(...
	 *				LogOp.xor(firstVar, secondVar)))
	 */
	def private LogOp createAlternativesXorClause(IntVar[] vars) {
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
	
	/**
	 * Modify the model in conformity of the solver results
	 * 
	 */
	def private void applyConstraints(Sequence tra) {
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
	def private void applyConstraints(Alternatives alt) {
		alt.options.forEach[applyConstraints]
	}
	
	/**
	 * Modify the model in conformity of the solver results
	 * 
	 */
	def private void applyConstraints(Optional opt) {
		if (variables.filter[value == 0].exists[name == opt.name]) {
			opt.active = false
		}
	}
	
}