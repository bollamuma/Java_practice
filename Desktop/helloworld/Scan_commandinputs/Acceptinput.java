import java.util.Scanner;

 public class Acceptinput{  //if class is public then class name is to be same as file name
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter integer ");
        //int integer1 = scanner.nextInt();
        //int integer2 = scanner.nextInt();

        //System.out.println(integer1+" "+integer2);

        //check if entered input is integer
        String integer = scanner.nextLine();

        try{
            int intvalue = Integer.parseInt(integer.trim());// trim spaces before or after integer is entered
            System.out.println("valid input");
            System.out.println(integer);
        }
        catch(NumberFormatException e){
            System.out.println("input is not valid");
        }

    }
        }