import java.util.Scanner;

public class _calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // take input from the user until the user presses X or x
        int ans = 0;
        while (true) {
            // take the operator as input
            System.out.print("Enter the operator (+, -, *, /, %, X): ");
            char op = in.next().trim().charAt(0);
            
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue;  // Skip the calculation and ask for input again
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }
                System.out.println("Result: " + ans);
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation");
            }
        }
        
        System.out.println("answer : " + ans);
        in.close();  // Close the scanner
    }
}
