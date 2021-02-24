import java.io.*;
import java.util.*;

class ArrayListExample {
    public static void main(String[] args)
    {
        ArrayList l = new ArrayList();  //can add duplicates,null object,heterogenous elements,insertion order is preserved
        System.out.println("number of objects in array list is "+l.size());
        l.add("A");
        l.add("10");
        l.add("A");
        l.add("null");
        System.out.println(l);
        l.remove(2);
        l.add(2,"M");
        l.add("N");
        System.out.println(l);
        System.out.println("number of objects in array list is "+l.size());
    }
}