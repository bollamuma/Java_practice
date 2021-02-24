import java.util.*;
class TreeSet1{
    public static void main (String[] args){
        TreeSet t =new TreeSet();
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("z");
        t.add("L");
        System.out.println(t);
        System.out.println("elements are printed by default natural sorting order");
    }
}