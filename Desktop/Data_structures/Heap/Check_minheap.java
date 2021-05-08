

import java.lang.*;

public class Check_minheap {
    //static int max_size = 15;
    static int[] min_heap = {1,3,4,5,2};
    static int size;

    public static void main(String[] args) {


        size = min_heap.length;
        int current=0;
        if(is_minheap(current))
            System.out.println("true");
        else
            System.out.println("false");

    }

     public static boolean is_minheap(int current)
     {
         if(current==size-1)
             return true;
         if(2*current+2>=size)
         {
             if(2*current+1<size)
             {
                 if(min_heap[current]<min_heap[2*current+1])
                     return true;
                 else
                     return false;
             }
             if(2*current+1>=size)
                 return true;
         }
         if(2*current+2<size)
         {
             if((min_heap[current]< min_heap[2*current+1]) && min_heap[current]<min_heap[2*current+2])
             {
                 if(is_minheap(2*current+1) && is_minheap(2*current+2))
                     return true;

             }
         }


         return false;
     }
}