//print 1 to 100 without using for loop
class printnum
{
    public static void main(String[] args)
    {
        recursiveprint(1);

    }

        static void recursiveprint(int i)
        {
            if(i<101)
            {
                System.out.println(i);
                recursiveprint(i+1);
            }


        }
}