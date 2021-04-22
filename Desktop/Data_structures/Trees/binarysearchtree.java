 public class binarysearchtree{

    binarynode root;
    static int minimum=0,maximum=0;

    public void insert(int key)
    {
        binarynode node = new binarynode();
        node.key=key;

        node.left=node.right=null;
        if(root ==null)
        {
            root=node;

        }
        else
        {
            binarynode n=root;

            while(true)
            {

                if(key<n.key)
                {


                    if(n.left!=null)
                    n=n.left;
                    else{
                        n.left=node;
                        break;
                    }


                }
                else if(key>n.key)
                {
                    if(n.right!=null)
                    n=n.right;
                    else{
                        n.right=node;
                        break;
                    }
                }

                else{
                    System.out.println("same elements are not allowed and hence not inserting "+node.key+" again");
                    return;
                }


            }


        }


    }

   public void printbst()
    {


        inorderprint(root);
    }

    public void inorderprint(binarynode root)
    {


        if(root!=null)
        {
            inorderprint(root.left);
            System.out.println(root.key);
            inorderprint(root.right);
        }
    }

    public void printvertical()
    {

        findextremes(root,0);
        for(int i=minimum;i<=maximum;i++)
        {

            printeachline(i,0,root);
            System.out.println("");
        }


    }

    public void printeachline(int linenum,int currentnum,binarynode node){

        if(node==null)
            return;
        if(linenum==currentnum){
            System.out.print(node.key+" ");
        }

            printeachline(linenum,currentnum-1,node.left);
            printeachline(linenum,currentnum+1,node.right);

    }

    public void findextremes(binarynode node,int temp){


        if(node==null)
            return;
        if(temp<minimum)
            minimum=temp;
        else if(temp>maximum)
            maximum=temp;

            findextremes(node.left,temp-1);
            findextremes(node.right,temp+1);

    }

    public void delete(int delkey)
    {
        //search for key
        deletefunc(delkey,root);
        


     }

     public void deletefunc(int delkey,binarynode root)
     {
         if(delkey==root.left.key){
             if(root.left.left!=null)
                 root.left=root.left.left;
             else if(root.left.right!=null)
                 root.left=root.left.right;
         }
     }

     public void printnodesequalssum(int sum)
     {
         traversetree(root,sum);
     }

     public void traversetree(binarynode node,int sum)
     {

         if(node==null)
             return;
         int temp=sum-node.key;

         if(search(temp)==true)
         {
             System.out.println("nodes are: "+node.key+"and "+ temp);
         }

         traversetree(node.left,sum);
         traversetree(node.right,sum);

     }

     public boolean search(int temp) {

        binarynode node = root;

        while(true)
        {
            if(node.key==temp)
            {
                return true;
            }

            else if(node.key>temp)
            {
                if(node.left!=null)
                    node = node.left;
                else
                    break;
            }
            else
            {
                if(node.right!=null)
                    node = node.right;
                else
                    break;
            }





        }
         return false;
     }

     /*public boolean checkelement(int temp, binarynode node)
     {


         if(node!=null)
         {
             if(node.key==temp)
                 return true;
             checkelement(temp,node.left);
             checkelement(temp,node.right);
         }

         return false;


     }*/

}