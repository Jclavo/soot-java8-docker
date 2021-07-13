package src.soot.analysis.inter;

import java.util.Map;

import soot.*;

public class PrintClasses{

    public static void main(String[] args) {
      PackManager.v().getPack("wjtp").add(
          new Transform("wjtp.myTransform", new SceneTransformer() {
            protected void internalTransform(String phaseName,
                Map options) {
              System.err.println(Scene.v().getApplicationClasses());
            }
          }));
      // System.out.println("Testing inter transformations...");
      soot.Main.main(args);
    }
}