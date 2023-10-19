import java.util.Arrays;

public class _13_Special_Array_With_X_Elements_Greater_Than_or_Equal_X {
    public static void main(String[] args) {
        _13_Special_Array_With_X_Elements_Greater_Than_or_Equal_X solution = new _13_Special_Array_With_X_Elements_Greater_Than_or_Equal_X();

        // Example 1
        // int[] nums1 = {3, 5};
        // int result1 = solution.specialArray(nums1);
        // System.out.println("Example 1 Output: " + result1);

        // // Example 2
        // int[] nums2 = {0, 0};
        // int result2 = solution.specialArray(nums2);
        // System.out.println("Example 2 Output: " + result2);

        // Example 3
        int[] nums3 = {0, 4, 3, 0, 4};
        int result3 = solution.specialArray(nums3);
        System.out.println("Example 3 Output: " + result3);
    }

    public static int specialArray(int[] nums) {
        int n = nums.length;
       int[] count = new int[n + 1];

       for (int num : nums) {
           if (num < n) {
               count[num]++;
           } else {
               count[n]++;
           }
       }

     System.out.println(Arrays.toString(count));

       int sum = 0;

       for (int x = n; x >= 0; x--) {
           sum += count[x];
           if (x == sum) {
               return x;
           }
       }

       return -1;
   }
}
