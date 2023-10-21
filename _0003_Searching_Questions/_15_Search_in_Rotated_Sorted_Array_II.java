public class _15_Search_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
int target1 = 0;
System.out.println(search(nums1, target1)); // Output: true

int[] nums2 = {2, 5, 6, 0, 0, 1, 2};
int target2 = 3;
System.out.println(search(nums2, target2)); // Output: false

    }

    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
    
            if (nums[mid] == target) {
                return true;
            }
    
            // If left half is sorted
            if (nums[left] < nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // If right half is sorted
            else if (nums[left] > nums[mid]) {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            // Handle duplicates
            else {
                left++;
            }
        }
    
        return false;
    }
    
}
