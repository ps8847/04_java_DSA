public class _25_Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};

        int result1 = findDuplicate(nums1);
        int result2 = findDuplicate(nums2);

        System.out.println("Example 1 - Input: [1,3,4,2,2], Output: " + result1);
        System.out.println("Example 2 - Input: [3,1,3,4,2], Output: " + result2);
    }

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        int ptr1 = nums[0];
        int ptr2 = slow;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }
}
