import java.util.ArrayList;
import java.util.Scanner;

public class _05_q {
    public static void main(String[] args) {
        
        // 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

        Scanner in = new Scanner(System.in);

        int sum = 0;

        while (in.hasNextInt()) {
            int num = in.nextInt();
            sum += num;
        }

        System.out.println("Sum of all entered numbers is: " + sum);

    }
}
