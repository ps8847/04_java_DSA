public class _29_Find_Minimum_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        System.out.println("Minimum in [1, 3, 5]: " + findMin(nums1)); // Output: 1

        int[] nums2 = {2, 2, 2, 0, 1};
        System.out.println("Minimum in [2, 2, 2, 0, 1]: " + findMin(nums2)); // Output: 0
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }

        return nums[left];
    }

}
