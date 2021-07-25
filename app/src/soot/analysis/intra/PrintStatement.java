/**
 * Title: Intra Analysis using "jtp" = jimple transformation pack
 * 
 * Function: Show statements from a body
 * 
 * Watch out: This file replace the call from soot.Main
 * 
 */

package src.soot.analysis.intra;

import java.util.Map;
import java.util.Iterator;

import soot.*;
import soot.jimple.*;
import soot.options.Options;

public class PrintStatement{

  public static void main(String[] args) {

      PackManager.v().getPack("jtp").add(new Transform("jtp.PrintStatement", new MyTransformer())); 
      soot.Main.main(args);
  }
}

class MyTransformer extends BodyTransformer{

  protected void internalTransform(Body body, String phase, Map options) {
              
    // code here
    Iterator<Unit> it = body.getUnits().snapshotIterator();
     
    while(it.hasNext()){
         Stmt stmt = (Stmt)it.next();
         System.out.println(stmt);
    } 
  }

}

