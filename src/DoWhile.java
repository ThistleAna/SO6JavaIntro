public class DoWhile {
    public static void main(String[] args) {
        // Do..while execute the condition at least once
        int i =0;

        do { // repeat this code
            System.out.println(i + " : I am executed.");
            // update the counter
            i++;
        }while (i==1); // and check this condition after executing the do body
    }
}
