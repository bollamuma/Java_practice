import java.util.*;

class IteratorExample {
    public static void main(String[] args)

    {
        ArrayList v = new ArrayList();  //can add duplicates,null object,heterogenous elements,insertion order is preserved

        // l.add("A");
        for (int i = 1; i <= 10; i++) {
            v.add(i);
        }
        System.out.println(v);
        Iterator itr = v.iterator();
        System.out.println("even integers are :");
        while (itr.hasNext()) {
            Integer I = (Integer) itr.next();

            if (I % 2 == 0)
                System.out.println(I + " ");
            else
                itr.remove();


        }
        System.out.println("");
        System.out.println(v+": odd integers are removed");
    }


}