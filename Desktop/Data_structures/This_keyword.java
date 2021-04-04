 class Main {
    int x;

    // Constructor with a parameter
     Main(int x) {
        this.x = x;


    }

    // Call the constructor
    public static void main(String[] args) {
        Main myObj = new Main(5);
        System.out.println("Value of x = " + myObj.x);
    }
}