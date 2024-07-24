public class _37_Sort_Colors {
    public static void main(String[] args) {
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors(nums1);
        printArray(nums1); // Output: [0, 0, 1, 1, 2, 2]

        int[] nums2 = {2, 0, 1};
        sortColors(nums2);
        printArray(nums2); // Output: [0, 1, 2]
    }

    public static void sortColors(int[] nums) {

        int low = 0; // Index for elements less than 1 (red)
        int high = nums.length - 1; // Index for elements greater than 1 (blue)
        int current = 0; // Current index for iterating through the array

        while (current <= high) {
            
            if (nums[current] == 0) {
                // Swap the current element with the element at the low index
                swap(nums, current, low);
                current++;
                low++;

            } else if (nums[current] == 2) {
                // Swap the current element with the element at the high index
                swap(nums, current, high);
                high--;
                
            } else {
                // Element is 1, move to the next element
                current++;
            }

        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
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
