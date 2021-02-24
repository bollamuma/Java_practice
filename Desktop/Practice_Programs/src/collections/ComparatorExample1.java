//integer objects are inserted in descending order
import java.util.*;
class ComparatorExample1{
    public static void main (String[] args){
        TreeSet t =new TreeSet(new myComparator());
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        t.add(10);
        System.out.println(t);
        System.out.println("elements are printed by descending order");

    }

}
class myComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        Integer I1 = (Integer)obj1;
        Integer I2 = (Integer)obj2;
        return -I1.compareTo(I2);
    }
}