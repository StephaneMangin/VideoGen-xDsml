package org.irisa.diverse.videogen.videoGen.aspects.visitors

import java.util.ArrayList
import java.util.List
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.aspects.utils.LoggableVisitor
import org.chocosolver.solver.Solver
import org.chocosolver.solver.trace.Chatterbox
import org.chocosolver.solver.constraints.IntConstraintFactory
import org.chocosolver.solver.search.strategy.IntStrategyFactory
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VariableFactory
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.VF
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.chocosolver.solver.constraints.LogicalConstraintFactory
import org.chocosolver.solver.ResolutionPolicy

class VideoGenUserContraintsVisitor extends LoggableVisitor {
	
	private IntVar minConstraint // User defined
	private IntVar maxConstraint // User defined
	private List<Optional> sequences
	Solver solver = new Solver("Min/Max Constraints")
	
	new () {
		super()
		log.info("minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)
	}
	
	def visit(VideoGen vid, int min, int max) {
		minConstraint = VariableFactory.fixed(min, solver)
		maxConstraint = VariableFactory.fixed(max, solver)
		sequences = new ArrayList
		log.info("VideoGen User Contraints Visitor started...")
		log.info("BEFORE => minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)
		VideoGenHelper.allSequences(vid).forEach[visit]
		log.info("AFTER => minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)
		log.info("sequences=" + sequences)
		
		// 3. Create and post constraints by using constraint factories
        //solver.post(IntConstraintFactory.(, "+", sequences.sum, "<=", maxConstraint))
        // 4. Define the search strategy
		// 5. Launch the resolution process
        //solver.findAllOptimalSolutions(ResolutionPolicy.SATISFACTION)
        //6. Print search statistics
        Chatterbox.printStatistics(solver)
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
		solver.post()
	}
	
	def private visit(Optional opt) {
		val ft = VariableFactory.integer(opt.name, 0, 1, solver)
		val constraint = IntConstraintFactory.arithm(ft,"<=",1)
		var res = VF.bool(opt.name, solver)
		constraint.reifyWith(res)
	}
	
	def private visit(Mandatory man) {
		val ft = VariableFactory.integer(man.name, 0, 1, solver)
		val constraint = IntConstraintFactory.arithm(ft,"=",1)
		var res = VF.bool(man.name, solver)
		constraint.reifyWith(res)
	}
}