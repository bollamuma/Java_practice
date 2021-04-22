
// print a binary tree in vertical order


import java.util.*;
import java.util.Iterator;

public class binarytree
 {
     public static void main(String[] args)
     {
         try{
             TreeSet ts = new TreeSet() ;
             ts.add(1);
             ts.add(2);
             ts.add(3);
             ts.add(4);
             ts.add(5);
             ts.add(6);
             ts.add(7);
             ts.add(8);
             ts.add(9);
             //System.out.println(ts);
             Iterator ltr = ts.iterator();
             while(ltr.hasNext()){
                 Integer i = (Integer) ltr.next();
                 System.out.println(i);
                 //System.out.println(ts);
             }
           //  System.out.println(ltr);

         }
         catch(NullPointerException e){
             System.out.println("exception thrown"+e);
         }

     }


 }
