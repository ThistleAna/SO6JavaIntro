// import scanner class here
import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner (System.in);
        // ask user to enter int number
        System.out.println("Enter a number");
        // save this to a variable called answer, read this as integer
        int answer = reader.nextInt();
        // use for loop to display number from 1 to 12
        for (int x=1; x<=12; x=x+1) {
            // print the counter
            System.out.println(answer + " times " + x + " equals " + (answer * x));
        }

    }
}
