import java.util.Scanner;
public class TemperatureChecker {
    public static void main(String[] args) {
        // create object Scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("What is the temperature today ? In Celcius");
        int temp = reader.nextInt();
        // hot > 35 , warm 20 - 35, cold < 20
        if(temp >= 35) {
           // if statement true, execute this code
            System.out.println("It is too hot outside. Be ware of the sun.");
        }
        else if (temp >= 20 && temp <35 ) {
            // else if is true, execute this
            System.out.println("Temperature is between 20-35. It is nice to go out.");
        } else {
            // if the 'if' and 'else if' are false, execute this
            System.out.println("Temperature is too cold. It is below 20.");
        }

        System.out.println("This code is outside the if, else-if statement.");

        // your task: ask user to enter a number
        // if number is even, say that the number is even, number % 2 == 0
        // if number is odd , say that the number is odd, number % 2 != 0
        // if the number is negative, say that it is a negative number

    }
}
