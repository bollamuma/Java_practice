
import java.io.*;


class Pin {


private long balance=1000;
    long pin_id;


    public void get_pin(long Id)
    {
        if (this.pin_id == Id) {

            // Return current balance
            System.out.println("authorisde user");
            System.out.println("balance is:"+balance );
        }

        // Unauthorised user
        else
            System.out.println(("unauthorised user"));
    }
}

// Another class created- Employee
public class Datahiding {
    public static void main(String[] args)
    {
        // Creating employee object of bank type
         Pin user = new Pin();

        // Assisgning employee object values
        user.pin_id = 12345;

        user.get_pin(12345);


    }
}