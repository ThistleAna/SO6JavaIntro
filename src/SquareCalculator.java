// import Scanner class
import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        System.out.println("===RECTANGLE CALCULATOR===");
        // create Scanner object
        Scanner reader = new Scanner (System.in);
        // 1. Ask user to enter the width, declare variable called width and read from the user
        System.out.println("Enter width");
        double width = reader.nextDouble();
        // 2. Ask user to enter height, declare variable called height and read from the user
        System.out.println("Enter height");
        double height = reader.nextDouble();
        // 3. Print variables width and height
        System.out.println("You have entered " + width + " and " + height);
        // 4. Create variable perimeter, calculate using 2* (width+height)
        double perimeter = 2 * (width + height);
        // 5. Print variable perimeter, e.g "The rectangle perimeter is " + perimeter
        System.out.println("Perimeter = " + perimeter);
        // 6. Create variable area, calculate using area = width * height
        double area = width * height;
        // 7. Print variable area
        System.out.println("Area = " + area);

    }
}
