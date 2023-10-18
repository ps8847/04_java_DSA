public class _08_Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
            int target1 = 5;
            int target2 = 2;
            int target3 = 7;

            int result1 = searchInsert(nums, target1);
            int result2 = searchInsert(nums, target2);
            int result3 = searchInsert(nums, target3);

            System.out.println(result1); // Output: 2
            System.out.println(result2); // Output: 1
            System.out.println(result3); // Output: 4
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
    
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        // If the loop exits, it means the target is not in the array.
        // 'left' now points to the index where the target should be inserted.
        return left;
    }
    
}
