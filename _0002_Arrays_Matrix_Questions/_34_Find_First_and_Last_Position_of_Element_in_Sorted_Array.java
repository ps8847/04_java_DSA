import java.util.Arrays;

public class _34_Find_First_and_Last_Position_of_Element_in_Sorted_Array{
    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = searchRange(nums1, target1);
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = searchRange(nums2, target2);
        System.out.println(Arrays.toString(result2));

        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = searchRange(nums3, target3);
        System.out.println(Arrays.toString(result3));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }

        if (result[0] != -1) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[j] == target) {
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }
}