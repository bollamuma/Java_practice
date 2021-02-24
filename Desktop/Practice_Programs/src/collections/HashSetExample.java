import java.util.*;
class HashSetExample{
    public static void main(String[] args){
        HashSet h = new HashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add("null");
        h.add("10");
        System.out.println(h);

        System.out.println("number of objects in set is :"+h.size());
        System.out.println(h.add("Z")+" : Duplicates are not allowed");
        System.out.println(h);
    }
}