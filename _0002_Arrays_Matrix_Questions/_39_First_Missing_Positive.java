public class _39_First_Missing_Positive {
    public static void main(String[] args) {
        _39_First_Missing_Positive solution = new _39_First_Missing_Positive();
        int[] nums1 = {1, 2, 0};
        int[] nums2 = {3, 4, -1, 1};
        int[] nums3 = {7, 8, 9, 11, 12};

        System.out.println("Example 1: " + solution.firstMissingPositive(nums1)); // Output: 3
        System.out.println("Example 2: " + solution.firstMissingPositive(nums2)); // Output: 2
        System.out.println("Example 3: " + solution.firstMissingPositive(nums3)); // Output: 1
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Perform cyclic sort to place positive numbers in their correct positions.
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Step 2: Iterate through the sorted array to find the smallest missing positive integer.
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1; // If all positive integers from 1 to n are present, return n + 1.
    }
}
