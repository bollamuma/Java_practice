import java.util.*;
class LinkedHashSetExample{
    public static void main(String[] args){
        LinkedHashSet h = new LinkedHashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add("null");
        h.add("10");
        System.out.println(h+": Insertion order is preserved");

        System.out.println("number of objects in set is :"+h.size());
        System.out.println(h.add("Z")+" : Duplicates are not allowed");
        //System.out.println(h);
    }
}