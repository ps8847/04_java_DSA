public class _03_missing_number {
    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        System.out.println("Example 1 Output: " + missingNumber(nums1));

        int[] nums2 = {0, 1};
        System.out.println("Example 2 Output: " + missingNumber(nums2));

        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Example 3 Output: " + missingNumber(nums3));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        // Calculate the expected sum of numbers in the range [0, n]
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the array elements
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

}
