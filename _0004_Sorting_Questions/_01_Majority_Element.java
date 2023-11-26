public class _01_Majority_Element{
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println("Example 1 Output: " + majorityElement(nums1));

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Example 2 Output: " + majorityElement(nums2));
    }

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}