
// method resolution is based on runtime object
class P{
    public void property(){
        System.out.println("cash+land+gold");
    }
    public void marry(){
        System.out.println("Durga");
    }
}
class C extends P{
    public void marry(){
        System.out.println("Jyoti");
    }
}

class Overridingmethodresolution {
    public static void main(String[] args) {
        P p = new P();
        p.marry();
        C c = new C();
        c.marry();
        P p1 = new C();
        p1.marry();
    }
}