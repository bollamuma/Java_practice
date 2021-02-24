import java.util.*;

class VectorExample {
    public static void main(String[] args)
    {
        Vector l = new Vector();  //can add duplicates,null object,heterogenous elements,insertion order is preserved
        System.out.println("number of objects in vector is "+l.size());
        System.out.println("size of vector is "+l.capacity());
        System.out.println(l);
       // l.add("A");
        for(int i=1;i<=10;i++){
            l.addElement(i);
        }
        System.out.println(l);
        System.out.println("size of vector is "+l.capacity());
        System.out.println("number of objects in vector is "+l.size());
        l.add("a"); // 11th element is added----- size is doubled

        System.out.println(l);
        System.out.println("size of vector is "+l.capacity());
        System.out.println("number of objects in vector is "+l.size());
        l.add("string");
        l.removeElementAt(2);
        System.out.println("index 2 element is removed"+l);


    }
}