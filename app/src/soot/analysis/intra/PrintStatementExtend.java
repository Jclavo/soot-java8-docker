/**
 * Title: Intra Analysis using "jtp" = jimple transformation pack
 * 
 * Function: Show statements from a body
 * 
 * Watch out: This file get the class' path and class' name as parameters. 
 * 
 */

package src.soot.analysis.intra;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.*;
import soot.options.Options;

public class PrintStatementExtend extends BodyTransformer {

    public static String sourceDirectory = "";
    public static String clsName = "";
    public static String methodName = "";

    public static void main(String[] args) throws FileNotFoundException, IOException {

        if (!getArgs(args)) {
            return;
        }

        setupSoot();

        //add an intra-procedural analysis phase to Soot
	    PrintStatementExtend analysis = new PrintStatementExtend();
	    PackManager.v().getPack("jtp").add(new Transform("jtp.PrintStatementExtend", analysis));

        //run pack
	    PackManager.v().runPacks();
    }

    @Override
	protected void internalTransform(Body b, String phaseName,
		Map<String, String> options) {

		Iterator<Unit> it = b.getUnits().snapshotIterator();
	    while(it.hasNext()){
	    	Stmt stmt = (Stmt)it.next();
	    	System.out.println(stmt);
	    }
	}

    public static boolean getArgs(String[] args) {

        if (args.length != 2) {
            System.err.println("You must provide the rigth parameters.");
            return false;
        }

        sourceDirectory = args[0];
        clsName = args[1];

        return true;
    }

    public static void setupSoot() {
        G.reset();
        Options.v().set_prepend_classpath(true);
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_soot_classpath(sourceDirectory);
        SootClass sc = Scene.v().loadClassAndSupport(clsName);
        sc.setApplicationClass();
        Scene.v().loadNecessaryClasses();
    }

}