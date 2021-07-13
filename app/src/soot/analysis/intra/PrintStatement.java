package src.soot.analysis.intra;

import java.util.Map;
import java.util.Iterator;

import soot.*;
import soot.jimple.*;
import soot.options.Options;

public class PrintStatement{

    public static void main(String[] args) {

        PackManager.v().getPack("jtp").add(
          new Transform("jtp.PrintStatement", new BodyTransformer() {
  
            protected void internalTransform(Body body, String phase, Map options) {
              
               // code here
               Iterator<Unit> it = body.getUnits().snapshotIterator();
                
               while(it.hasNext()){
                    Stmt stmt = (Stmt)it.next();
                    System.out.println(stmt);
               } 
            }
  
          }));
  
        //Options.v().set_verbose(true);
        //PhaseOptions.v().setPhaseOption("jap.npc", "on");
        soot.Main.main(args);
      }

}