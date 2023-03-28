// import scanner class here
import java.util.Scanner;

public class SumTo {
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // ask user to enter int number
        System.out.println("Enter the number to sum to = ");
        // save this to a variable called answer, read this as integer
        int answer = reader.nextInt();
        // --- declare variable sumTo , this will be a temporary storage each time you add 2 numbers
        int sumTo =0;
        // use while loop to display number from 1 to answer
        int counter=1;
        while (counter <= answer) {
            if (counter != answer) { //if it is the last number to display, remove plus sign
                System.out.print(counter + " + ");
            } else {
                System.out.print(counter + "  ");
            }
            // inside the while loop, calculate the sum = sum + counter
            sumTo = sumTo + counter;
            // update the counter, incrementing
            counter++;

        }

        System.out.println("= " + sumTo);
    }
}
