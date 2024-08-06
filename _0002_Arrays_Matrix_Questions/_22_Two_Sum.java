import java.util.HashMap;
import java.util.Map;

public class _22_Two_Sum {
    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        printResult(result1); // Expected output: [0, 1]

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        printResult(result2); // Expected output: [1, 2]

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        printResult(result3); // Expected output: [0, 1]
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    // optimized

    public static int[] twoSum2(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }

            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array or throw an exception as per requirement
        return new int[0];
      
    }


    public static void printResult(int[] result) {
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No valid indices found.");
        }
    }
}
