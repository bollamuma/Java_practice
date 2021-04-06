// print all possible permutations of a given number

class permutations
{
    public static void main (String [] args)
    {
        String str = "1234";
        String pivot = "";
        perm(str,pivot);  //pivot is an element which is fixed and permutations of remaining elements are found
    }

    public static void perm(String str,String pivot)
    {
        //str.replaceAll("\\s","");
        if(str.length()==2)
        {
            System.out.println(pivot+str);
              //reverse str
            StringBuffer sbr = new StringBuffer(str);
            sbr.reverse();
            System.out.println(pivot+sbr);

        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                perm(str.substring(0,i)+str.substring(i+1),pivot+str.charAt(i));
               // System.out.println("");
            }
        }

    }
}