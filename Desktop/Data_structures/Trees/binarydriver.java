public class binarydriver {

    public static void main(String[] args)
    {
        binarysearchtree bst = new binarysearchtree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
       // bst.insert(50);

       // bst.printbst();

      //  bst.printvertical();

        //bst.delete(30);

        bst.printnodesequalssum(50);
    }



}