import java.util.*;

class StackExample {
    public static void main(String[] args)
    {
        Stack s = new Stack();  //can add duplicates,null object,heterogenous elements,insertion order is preserved
        System.out.println("number of objects in stack is "+s.size());
        System.out.println("size of stack is "+s.capacity());
        System.out.println(s);
        // s.add("A");
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);//insertion order is preserved as it as a list
        System.out.println("offset of A " +s.search("A"));
        System.out.println("offset of 2 is "+ s.search("2"));
        System.out.println(s.pop());
        System.out.println("after pop operation "+s);
        System.out.println("top object is "+ s.peek());
        System.out.println("after peek operation "+s);
        if(s.empty())
        {
            System.out.println("stack is empty");
        }
        else{
        System.out.println("stack is not empty");
    }




    }
}