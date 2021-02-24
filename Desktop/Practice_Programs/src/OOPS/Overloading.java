class Overloading{
    public void m1(){
        System.out.println("no arg method");

    }
    public void m1( int i){
        System.out.println("integer arg method");
    }
    public void m1(double d){
        System.out.println("double arg method");
    }
    public void m1(int ...x){
        System.out.println("var arg method");
    }

    public static void main(String[] args){
        Overloading o = new Overloading();
        o.m1();
        o.m1(10);
        //double d = 10.5;
        o.m1(10.5);
        o.m1('a'); // automatically upgraded to int method as no m1 method that takes char as input
        o.m1(10,20);
    }
}

