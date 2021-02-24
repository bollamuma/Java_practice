class P{
    public void m1(){
        System.out.println("Parent");
    }
}
class C extends P{
    public void m2(){
        System.out.println("child");
    }
}
 class Inheritance{
    public static void main (String[] args){
        P p = new P();
        p.m1();
        //p.m2(); child method is not applicable to parent
        C c = new C();
        c.m1();  // parent method is applicable to child
        c.m2();
        P p1= new C();
        p1.m1();  //parent reference can be  used to hold child object but using this we can call only parent specific methods
        //p1.m2(); //
    }
 }