public class WhilePrintEven {
    public static void main(String[] args) {
        int counter =2;
        while (counter <=10) {
            System.out.println(counter);
            // skip the number so that we only print the even numbers
            counter = counter +2;
        }
    }
}
