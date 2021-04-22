

import java.util.*;


public class LongestRepeatingss {

    static String s = "abcdsabcaewcabcad";
    static int length = s.length();
    static int count =0;

    public static void main(String[] args) {
        int i=0,j=length/2;
        substr(i,j);
        if(count==0)
            System.out.println("no repitition");
    }

    public static void substr(int i,int j)
    {

        if(i>=j)
            return;
       String current=s.substring(i,j);
        String left = s.substring(0,i);
        String right = s.substring(j,length);


        if((left.contains(current) ||right.contains(current)) && count==0)
        {
            System.out.println("longest substring is "+current);
            count++;
            return;
        }
        else if(count==0)
        {
            substr(i+1,j);
            substr(i,j-1);
        }

    }
}