public class _21_q {
    public static void main(String[] args) {
        // 41. Factorial Program In Java

        int number = 5; // Change this to the number for which you want to calculate the factorial
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
        
    }
}
