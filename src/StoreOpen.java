import java.sql.SQLOutput;
import java.util.Scanner;
public class StoreOpen {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Is the store open ? Y or N");
        String response = reader.nextLine();

        if (response.equals("Y") || response.equals("N")) { // ACCEPT CORRECT RESPONSE
            if (! response.equals("Y")) { // nested if
                System.out.println("Sorry, store is closed.");
            } else {
                System.out.println("Welcome. We are open today!");
            }
        } else { // THROWING EXCEPTION
            System.out.println("Enter correct response. Y for Yes, N for No");
        }

        // modify this, if the user entered other than Y or N, you will say, Wrong Response. Only Y or N please.


    }
}
