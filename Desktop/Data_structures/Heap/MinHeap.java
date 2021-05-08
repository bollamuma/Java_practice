

import java.lang.*;

public class MinHeap {
    static int max_size=15;
static int[] min_heap = new int[max_size];
static int size=0;

    public static void main(String[] args) {

        insert(5);
        insert(4);
        insert(8);
        insert(1);
        insert(9);
        insert(6);
        insert(2);
        insert(3);
       // print();  //1 3 2 4 9 8 6 5
        delete();
        print();

    }

    public static void insert(int element)
    {
        if(size>=max_size){
            System.out.println("heap is full");
            return;
        }


        min_heap[size] = element;

        check_heap(size);
        size++;



    }

    public static void check_heap(int i)
    {
        if(i==0)
            return;

        if(min_heap[i]<min_heap[(i-1)/2])
        {
            int temp = min_heap[i];
            min_heap[i] = min_heap[(i-1)/2];
            min_heap[(i-1)/2] = temp;
            check_heap((i-1)/2);
        }
    }

    public static void print()
    {
        for(int i=0;i<size;i++)
            System.out.println(min_heap[i]);
    }

    public static void delete()
    {
        if(size==0)
            return;
        int temp = min_heap[0];
        min_heap[0]=min_heap[size-1];
        min_heap[size-1]=temp;
        size--;
        heapify(0);


    }

    public static void heapify(int i)
    {
        int min;
        if(2*i+2>=size)
        {
            if(2*i+1<size)
            {
                int temp = min_heap[i];
                min_heap[i]=min_heap[2*i+1];
                min_heap[2*i+1]=temp;
            }

        }

        if(2*i+2<size)
        {
            if(min_heap[i]> min_heap[2*i+1] || min_heap[i]>min_heap[2*i+2])
            {
                if (min_heap[2*i+1]>min_heap[2*i+2])
                    min = 2*i+2;
                else
                     min = 2*i+1;

                int temp = min_heap[i];
                min_heap[i]=min_heap[min];
                min_heap[min]=temp;
                heapify(min);
            }
        }

    }


}