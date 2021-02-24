class Heapmemortstats{
    public static void main(String[] args){
        Runtime r = Runtime.getRuntime();
        System.out.println("max memory:"+r.maxMemory());
        System.out.println("intial memory:"+r.totalMemory());


        System.out.println("free memory:"+r.freeMemory());
        long l = r.totalMemory() - r.freeMemory();
        //System.out.println(l);

        System.out.println("consumed memory:"+l);
    }
}