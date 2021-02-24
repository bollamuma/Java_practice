
// though object is eligible for GC, finalise method is called on any object only once
import java.util.*;
class FinaliseMethodExample2 {

static  FinaliseMethodExample2 f;
    public static void main(String[] args) throws Exception {
        FinaliseMethodExample2 s = new FinaliseMethodExample2();
        //System.out.println(s.hashCode());
        s = null;
        System.gc();
        //Runtime r = Runtime.getRuntime();
        //r.gc();
        Thread.sleep(5000);
        //System.out.println(f.hashcode());
        f = null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("end of main");
    }
    public void finalize(){
        System.out.println("finalise method called");
        f = this;
    }

}