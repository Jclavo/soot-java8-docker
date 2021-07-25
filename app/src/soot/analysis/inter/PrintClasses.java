/**
 * Title: Intra Analysis using "wjtp" = whole jimple transformation pack
 *
 * Function: Show applications' classes
 *
 * Watch out: This file replace the call from soot.Main
 *
 */

package src.soot.analysis.inter;

import java.util.Map;
import soot.*;

public class PrintClasses {

  public static void main(String[] args) {
    //call transformer
    PackManager.v().getPack("wjtp").add(new Transform("wjtp.myTransform", new MyTransformer()));

    soot.Main.main(args);
  }
}

class MyTransformer extends SceneTransformer {

  protected void internalTransform(String phaseName, Map options) {
    System.err.println(Scene.v().getApplicationClasses());
  }
}
