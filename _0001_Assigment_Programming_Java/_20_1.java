import java.util.Scanner;

public class _20_1 {
    public static void main(String[] args) {

        // 39. Take integer inputs till the user enters 0 and print the largest number from all.

        Scanner in = new Scanner(System.in);

        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer value

        while (true) {

            int num = in.nextInt();

            if (num == 0) {
                break;
            }

            if (num > largest) {
                largest = num; // Update largest if a larger number is entered
            }
        }

        if (largest != Integer.MIN_VALUE) {
            System.out.println("Largest number entered: " + largest);
        } else {
            System.out.println("No numbers entered.");
        }

        in.close();
    }
}
