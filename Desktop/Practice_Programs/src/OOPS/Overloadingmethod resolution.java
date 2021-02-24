// method resolution is based on reference type in overloading

class Animal {
}
class Monkey extends Animal {
}



class Overloadingmethodresolution{
    public void m1(Animal a){
        System.out.println("Animal verison");

    }
    public void m1(Monkey m){
        System.out.println("monkey version");
    }


    public static void main(String[] args){
        Overloadingmethodresolution o = new Overloadingmethodresolution();
        Animal a = new Animal();
        o.m1(a);
        Monkey m = new Monkey();
        o.m1(m);
       Animal a1 = new Monkey();
       o.m1(a1);

    }
}