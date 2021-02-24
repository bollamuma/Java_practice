import java.util.*;

class EnumeratorExample {
    public static void main(String[] args)

        {
            Vector v = new Vector();  //can add duplicates,null object,heterogenous elements,insertion order is preserved

            // l.add("A");
            for (int i = 1; i <= 10; i++) {
                v.addElement(i);
            }
            System.out.println(v);
            Enumeration e = v.elements();
            System.out.println("even integers are :");
            while (e.hasMoreElements()) {
                Integer I = (Integer) e.nextElement();

                if (I % 2 == 0)
                    System.out.print(I + " ");


            }
            System.out.println("");
        }


}
