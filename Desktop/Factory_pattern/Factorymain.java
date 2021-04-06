public class Factorymain {

    public static void main (String[] args)
    {

        OSfactory osf = new OSfactory();
        OS obj = osf.getstring("android");
        obj.spec();
        OS obj2 = osf.getstring("ios");
        obj2.spec();
        OS obj3 = osf.getstring("windows");
        obj3.spec();

    }
}
