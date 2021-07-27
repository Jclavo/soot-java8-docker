/**
 * Title: Intra Analysis using "jtp" = jimple transformation pack
 *
 * Function: Show statements from a body
 *
 * Watch out: This file replace the call from soot.Main
 *
 */

package src.soot.analysis.intra.cfa;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import soot.*;
import soot.jimple.*;
import soot.options.Options;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.toolkits.graph.UnitGraph;

import DominatorFinder.java;

public class SampleDominatorFinder {

  public static void main(String[] args) {
    PackManager
      .v()
      .getPack("jtp")
      .add(
        new Transform(
          "jtp.SampleDominatorFinder",
          new TransformerSampleDominatorFinder()
        )
      );

    // set configurations
    Options.v().set_verbose(true);

    soot.Main.main(args);
  }
}

class TransformerSampleDominatorFinder extends BodyTransformer {

  protected void internalTransform(Body b, String phase, Map options) {

    UnitGraph g = new ExceptionalUnitGraph(b);
    DominatorFinder analysis = new DominatorFinder(g);
    Iterator it = b.getUnits().iterator();

    while (it.hasNext()){
        Stmt s = (Stmt)it.next();
        List dominators = analysis.getDominators(s);
        Iterator dIt = dominators.iterator();
        while (dIt.hasNext()){
            Stmt ds = (Stmt)dIt.next();
            String info = s+" is dominated by "+ds;
            System.out.println(info);
        }
    }
  }

}
