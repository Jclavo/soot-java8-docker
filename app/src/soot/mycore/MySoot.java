package src.soot.core;
// package core;

import java.io.FileNotFoundException;
import java.io.IOException;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.*;
import soot.options.Options;

public class MySoot{

    public static String sourceDirectory = "";
    public static String clsName = "";
    public static String methodName = "";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        if (!getArgs(args)) {
            return;
        }

        setupSoot();
    }

    public static boolean getArgs(String[] args){

        if (args.length != 3 ){
            System.err.println("You must provide the rigth parameters.");
            return false;
        }

        sourceDirectory = args[0];
        clsName = args[1];
        methodName = args[2];

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