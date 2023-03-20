import java.util.Scanner;
public class OrOperator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Do you want to quit? Q or q to quit the game.");
        String response = reader.nextLine();

        if (response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game.");
        } else {
            System.out.println("Keep playing the game.");
        }
    }
}
