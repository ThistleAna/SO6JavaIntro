// USER INPUT
// 1. import scanner class
import java.util.Scanner;

public class LoginPage { // main class
    public static void main(String[] args) { // main method
        // 2. create scanner object
        Scanner reader = new Scanner (System.in);
        // prompt the user
        System.out.println("Username = ");
        // create variable to get the user input
        String userName = reader.nextLine();

        System.out.println("Thank you for your input. Your username is " + userName);
    }
}
