public class _07_Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 7, 11};
        int k1 = 5;
        int result1 = findKthPositive(arr1, k1);
        System.out.println("Result 1: " + result1);  // Output should be 9

        int[] arr2 = {1, 2, 3, 4};
        int k2 = 2;
        int result2 = findKthPositive(arr2, k2);
        System.out.println("Result 2: " + result2);  // Output should be 6
    }

    public static int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int currentNumber = 1;
        int index = 0;
    
        while (missingCount < k) {
            if (index < arr.length && arr[index] == currentNumber) {
                index++;
            } else {
                missingCount++;
            }
            if (missingCount < k) {
                currentNumber++;
            }
        }
    
        return currentNumber;
    }
    
}
