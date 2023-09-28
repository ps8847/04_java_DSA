public class _27_Plus_One {
    public static void main(String[] args) {
        int[] digits1 = { 1, 2, 3 };
        int[] digits2 = { 4, 3, 2, 1 };
        int[] digits3 = { 9 };

        int[] result1 = plusOne(digits1);
        int[] result2 = plusOne(digits2);
        int[] result3 = plusOne(digits3);

        printArray(result1);
        printArray(result2);
        printArray(result3);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate through the digits from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Check if the current digit is not 9
            if (digits[i] != 9) {
                // Increment the current digit by 1
                digits[i]++;
                // Return the updated array
                return digits;
            }
            // If the current digit is 9, set it to 0
            digits[i] = 0;
        }

        // If we reach this point, all digits were 9, so we need to add an extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the first digit to 1 (carry)
        return result;
    }
}
