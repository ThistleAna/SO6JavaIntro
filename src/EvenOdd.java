import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        // create object Scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("==EVEN OR ODD YOU ASK?==");
        System.out.println("What is your number?");
        int number = reader.nextInt();

        // IF ELSE STATEMENT
        if (number < 1 && number != 0) {
            // if statement is true, execute this
            System.out.println("Your number is negative number.");
        }
        else if (number ==0) {
            System.out.println("Your number is ZERO");
        }
        else if ( number % 2 == 0) {
            // else if statement is true, execute this
            System.out.println("Your number is an even number.");
        } else {
            System.out.println("Your number is an odd number.");
        }




        // your task: ask user to enter a number
        // if number is even, say that the number is even, number % 2 == 0
        // if number is odd , say that the number is odd, number % 2 != 0
        // if the number is negative, say that it is a negative number

    }
}
