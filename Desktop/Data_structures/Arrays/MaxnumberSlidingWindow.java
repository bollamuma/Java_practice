

import java.lang.*;


public class MaxnumberSlidingWindow {

    public static void main(String[] args)

    {
            int[] arr = new int[]{1,5,7,2,1,3,4};
            int k =3;
            int size=arr.length-k+1;
            int[] result = new int[size];

            int i=0,count=0,temp = arr[0];
            while(i< arr.length-1)
            {
                temp= Math.max(temp,arr[i+1]);

                if(i>=k-2)
                {
                    result[count]=temp;
                    temp=Math.max(arr[i+1],arr[i]);
                    count++;
                    i++;


                }
                else
                    i++;



            }
        for(i=0;i< result.length;i++)
        System.out.println(result[i]);
    }

}