package org.irisa.diverse.videogen.videoGen.aspects;

import java.util.function.Consumer;

import org.chocosolver.solver.ResolutionPolicy;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.search.solution.Solution;
import org.chocosolver.solver.search.strategy.IntStrategyFactory;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.Variable;
import org.chocosolver.solver.variables.VariableFactory;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.variables.BoolVar;

public class Test {
	
    static Solver solver = new Solver("Min max durations constraints");
    static IntVar OBJ = VariableFactory.bounded("objective", 3000, 5000, solver);
	
	public static void main(String[] args) {
        // Create variables through the variable factory
		IntVar ftM1 = VariableFactory.fixed("ftM1", 1, solver);
		IntVar ftM2 = VariableFactory.fixed("ftM2", 1, solver);
        BoolVar ftO1 = VariableFactory.bool("ftO1", solver);
        BoolVar ftO2 = VariableFactory.bool("ftO2", solver);
        BoolVar ftO3 = VariableFactory.bool("ftO3", solver);
        IntVar[] coefs = {ftM1, ftM2, ftO1, ftO2, ftO3};
        int[] durations = {1000, 2000, 500, 200, 200};
        // Create and post constraints by using constraint factories
        solver.post(IntConstraintFactory.scalar(coefs, durations, OBJ));
        System.out.println(solver.toString());
        // Launch the resolution process
        solver.findSolution();
        // Print search statistics
        Chatterbox.printStatistics(solver);
        // Print solutions
        int i = 0;
        do {
        	i++;
		    System.out.println("- Solutions " + i);
		    for (IntVar coef: coefs) {
		    	System.out.println("\t" + coef.getName() + " value=" + coef.getValue());
		    }
        } while (solver.nextSolution());
	}
}
