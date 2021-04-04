public class LinkedList {
    Node head;

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null; // not needed as default value is null
        //node.previous  = null;

        if(head ==null)
        {
            head = node;
        }
        else
        {
           Node n = head;
           while(n.next!=null)
           {
               n = n.next;

           }
           n.next = node;
          // n.next.previous = n;
        }

    }

    public void show()
    {
        Node node = head;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);


    }

    public void delete()
    {
        Node n = head;
        Node prev = null;
        while(n.next!=null)
        {
            prev = n;
            n = n.next;
        }
        prev.next = null;

    }


    public void deletenode(int key)
    {
        Node n = head;
        Node prev = head;

        while(n!=null)
        {
            if(n.data==key && n!=prev)
            {
                prev.next = n.next;
                //break;
            }

            if(n.data ==key && n==prev)
            {
               head = n.next;
            }

                prev = n;
                n = n.next;
        }
    }

    public void reverse()
    {
        Node current = head;
        Node prev = null;
        Node after = current.next;
        while(current.next!=null)
        {


            after = current.next;
            current.next = prev;
            //after.next = current;
            prev = current;
            current = after;



        }
        if(current.next==null)
        {
            head = current;
            head.next = prev;
            after = null;
        }


    }


}
