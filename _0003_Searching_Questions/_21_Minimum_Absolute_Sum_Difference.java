import java.util.Arrays;

public class _21_Minimum_Absolute_Sum_Difference {
    public static void main(String[] args) {
        _21_Minimum_Absolute_Sum_Difference solution = new _21_Minimum_Absolute_Sum_Difference();
        
        int[] nums1 = {1, 7, 5};
        int[] nums2 = {2, 3, 5};
        int result1 = solution.minAbsoluteSumDiff(nums1, nums2);
        System.out.println("Output 1: " + result1); // Expected output: 3

        int[] nums3 = {2, 4, 6, 8, 10};
        int[] nums4 = {2, 4, 6, 8, 10};
        int result2 = solution.minAbsoluteSumDiff(nums3, nums4);
        System.out.println("Output 2: " + result2); // Expected output: 0

        int[] nums5 = {1, 10, 4, 4, 2, 7};
        int[] nums6 = {9, 3, 5, 1, 7, 4};
        int result3 = solution.minAbsoluteSumDiff(nums5, nums6);
        System.out.println("Output 3: " + result3); // Expected output: 20
    }

     public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] sortedNums1 = nums1.clone();
        Arrays.sort(sortedNums1);
        int maxDiff = 0;
        int sumDiff = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            sumDiff = (sumDiff + diff) % 1_000_000_007;

            // Find the closest number in sortedNums1 to nums2[i]
            int closest = findClosest(sortedNums1, nums2[i]);

            int newDiff = Math.abs(closest - nums2[i]);
            maxDiff = Math.max(maxDiff, diff - newDiff);
        }

        int result = (sumDiff - maxDiff + 1_000_000_007) % 1_000_000_007;
        return result;
    }

    private int findClosest(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int closest = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            closest = Math.min(closest, Math.abs(arr[mid] - target));

            if (arr[mid] == target) {
                return target;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return target - closest;
    }
}
