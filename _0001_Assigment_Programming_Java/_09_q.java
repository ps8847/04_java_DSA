public class _09_q {
    public static void main(String[] args) {
        // 9. Take in two numbers and an operator (+, -, *, /) and calculate the value.
        // (Use if conditions)

        int num1 = 15;
        int num2 = 20;

        String operator = "*";

        if (operator == "+") {
            System.out.println("sum is : " + num1 + num2);
        } else if (operator == "*") {
            System.out.println("mul is : " + num1 * num2);
        } else if (operator == "-") {
            System.out.println("minus is : " + (num1 - num2));
        } else if (operator == "/") {
            System.out.println("divide is : " + (num1 / num2));
        }
    }
}
