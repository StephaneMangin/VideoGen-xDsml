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

class VideoGenUserContraintsVisitor extends LoggableVisitor {
	
	private IntVar[] globalCoefs
	private int[] globalDurations
    private Solver solver
    private IntVar objective
    private int globalCount
    
    new() {
		// Define a new solver
    	solver = new Solver("Min max durations constraints")
    	globalCount = 0
    }
    
	def visit(VideoGen vid, int min, int max) {
		val videoNumber = VideoGenHelper.allVideos(vid).size
		
		// Define the objective scalar with given contraints
		objective = VariableFactory.bounded("objective", min, max, solver)
		globalCoefs = newArrayOfSize(videoNumber) // Used to insert optional's coefficient
		globalDurations = newIntArrayOfSize(videoNumber) // Used to insert video durations. Must be a partition of coefs
		
		log.info("VideoGen User Contraints Visitor started...")
		log.info("\t => minConstraint=" + min + ", maxConstraint=" + max)
		
		// Call the visitor
		VideoGenHelper.allSequences(vid).filter[active].forEach[visit]
		
		// Create and post constraints by using constraint factories
        solver.post(IntConstraintFactory.scalar(globalCoefs, globalDurations, objective));
        log.info(solver.toString());
        // Launch the resolution process
        solver.findOptimalSolution(ResolutionPolicy.SATISFACTION, objective);
        // Print search statistics
        Chatterbox.printStatistics(solver);
        // Print solutions
        var i = 0;
        do {
        	i++;
		    log.info("- Solutions " + i)
		    for (IntVar coef: globalCoefs) {
		    	log.info("\t" + coef.getName() + " value=" + coef.getValue())
		    }
        } while (solver.nextSolution())
        
        // Then apply constraints
		VideoGenHelper.allSequences(vid).filter[active].forEach[applyConstraints]
	}
	
	def private void visit(Sequence tra) {
		if (tra.active) {
			if (tra instanceof Optional) {
				tra.visit
			} else if (tra instanceof Mandatory) {
				tra.visit
			} else if (tra instanceof Alternatives) {
				tra.visit
			}
		}
	}
		
	def private visit(Alternatives alt) {
		val optionsSize = alt.options.size
		val localCoefs = newArrayOfSize(optionsSize)
		var localCount = 0
		for (Optional option: alt.options) {
			val ft = VariableFactory.bool(option.name, solver)
			localCoefs.set(localCount, ft)
			localCount++
			addVar(ft, option.video.duration)
		}
		// Create the clause for selecting only one option
		SatFactory.addAtMostOne(localCoefs)
	}
	
	def private visit(Optional opt) {
		// For choco, a bool is a integer between 0 and 1
		addVar(VariableFactory.bool(opt.name, solver), opt.video.duration)
	}
	
	def private visit(Mandatory man) {
		// A mandatory has a fixed coef value of 1, mandatory right ;)
		addVar(VariableFactory.fixed(man.name, 1, solver), man.video.duration)
	}
	
	def private void addVar(IntVar intvar, int duration) {
		globalCoefs.set(globalCount, intvar)
		globalDurations.set(globalCount, duration)
		globalCount++
	}
	
	
	def private void applyConstraints(Sequence tra) {
		if (tra instanceof Optional) {
			tra.visit
		} else if (tra instanceof Alternatives) {
			tra.visit
		}
	}
	
	def private void applyConstraints(Alternatives alt) {
		alt.options.forEach[
			if (globalCoefs.filter[value == 0].exists[name == it.name]) {
				it.active = false
			}
		]
	}
	
	def private void applyConstraints(Optional opt) {
		if (globalCoefs.filter[value == 0].exists[name == opt.name]) {
			opt.active = false
		}
	}
	
}