import java.util.*;
public class String_int
{


    public static void main(String[] args)
    {

        String s= "ab12chbkl4";

        //System.out.println(s.charAt(0));
        int value = addnum(s);
        System.out.println(value);


    }

    public static  int addnum(String s)
    {
        int num=0;
        for(int i=0; i< s.length(); i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57)
            {
                num = num+Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        return num;

    }
}