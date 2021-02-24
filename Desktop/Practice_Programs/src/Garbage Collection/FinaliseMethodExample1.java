import java.util.*;
class FinaliseMethodExample1 {


    public static void main(String[] args) throws Exception {
        FinaliseMethodExample1 s = new FinaliseMethodExample1();
        s = null;
        System.gc();
        //Runtime r = Runtime.getRuntime();
        //r.gc();
        Thread.sleep(1000);
        System.out.println("end of main");
    }
        public void finalize(){
            System.out.println("finalise method called");
        }

}