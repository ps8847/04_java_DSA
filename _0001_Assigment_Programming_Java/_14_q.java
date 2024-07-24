public class _14_q {
    public static void main(String[] args) {
        
        // 14. To find Armstrong Number between two given number.

        int lowerBound = 50;
        int upperBound = 500;
        
        for (int number = lowerBound; number <= upperBound; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
        
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = (int) Math.log10(number) + 1;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
