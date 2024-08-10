public class _36_Rotate_Array {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        printArray(nums1); // Output: [5, 6, 7, 1, 2, 3, 4]

        // int[] nums2 = {-1, -100, 3, 99};
        // int k2 = 2;
        // rotate(nums2, k2);
        // printArray(nums2); // Output: [3, 99, -1, -100]
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // Handle cases where k is larger than the array length

        reverse(nums, 0, n - 1); // Reverse the entire array
        printArray(nums);
        reverse(nums, 0, k - 1); // Reverse the first k elements
        printArray(nums);
        reverse(nums, k, n - 1); // Reverse the remaining elements
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
