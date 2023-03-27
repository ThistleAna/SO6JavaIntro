public class Loop1 {
    public static void main(String[] args) {
        // for loop = repeat statement as long as condition is true
        for (int counter=1; counter <= 5; counter++ ) {
            // repeat this section
            System.out.print("Kick the enemy!");
            System.out.print("\n"); // creates a new line
        } // for loops end

        System.out.print("This code outside the loop");
        // while loop statement
        System.out.println("\nThis code repeated using While Loops");
        int counter =1;
        while (counter <=5) { // code repeated from here
            System.out.println("Hug the enemy");
            // update the counter
            counter = counter + 1;
        } // end of while loop

    }
}
