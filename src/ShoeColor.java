import java.util.Scanner;
public class ShoeColor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("You will go to formal dinner. What shoe color do you have?");
        String response = reader.nextLine();

        if (response.compareTo("black") == 0 || response.compareTo("brown") == 0){
            System.out.println("You are ready to go.");
        } else {
            System.out.println("Time to go shoe shopping :D");
        }


        System.out.println(response.compareTo("black")); // false if the input is other than black
    }
}
