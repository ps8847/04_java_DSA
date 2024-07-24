public class _14_Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(nums1)); // Output: 2

        int[] nums2 = { 3, 3, 7, 7, 10, 11, 11 };
        System.out.println(singleNonDuplicate(nums2)); // Output: 10

    }

    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {

                left = mid + 2;
            }
        }

        return nums[left];

    }
}