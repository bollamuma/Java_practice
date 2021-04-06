public class OSfactory {

    public OS getstring(String str){
        if(str.equals("android"))
            return new Android();
        else if(str.equals("ios"))
            return new IOS();
        else
            return new Windows();



    }
}
