public class Runner {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(18);
        list.insert(45);
        list.insert(12);

        list.show();

       // list.delete();

       // list.show();

        //list.deletenode(5);
        //list.show();



        list.reverse();
        list.show();
        list.reverse();
        list.show();

    }
}
