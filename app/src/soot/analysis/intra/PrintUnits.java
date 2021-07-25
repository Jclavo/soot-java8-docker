/**
 * Title: Intra Analysis using "jap" = jimple annotation pack
 * 
 * Function: Show units from a body
 * 
 * Watch out: This file replace the call from soot.Main
 * 
 */

package src.soot.analysis.intra;

import java.util.Map;

import soot.*;
import soot.options.Options;

public class PrintUnits{

    public static void main(String[] args) {

      PackManager.v().getPack("jap").add(new Transform("jap.PrintUnits", new MyTransformer()));

      // set configurations
      Options.v().set_verbose(true);
      PhaseOptions.v().setPhaseOption("jap.npc", "on");
      
      soot.Main.main(args);
    }
}

class MyTransformer extends BodyTransformer{

  protected void internalTransform(Body body, String phase, Map options) {
    for (Unit u : body.getUnits()) {
      // System.out.println(u.getTags());
      System.out.println(u.toString());
    }
  }
}