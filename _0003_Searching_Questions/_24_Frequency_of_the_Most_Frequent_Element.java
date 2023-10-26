import java.util.Arrays;

public class _24_Frequency_of_the_Most_Frequent_Element {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4};
        int k1 = 5;
        int result1 = maxFrequency(nums1, k1);
        System.out.println("Example 1: " + result1); // Expected output: 3

        int[] nums2 = {1, 4, 8, 13};
        int k2 = 5;
        int result2 = maxFrequency(nums2, k2);
        System.out.println("Example 2: " + result2); // Expected output: 2

        int[] nums3 = {3, 9, 6};
        int k3 = 2;
        int result3 = maxFrequency(nums3, k3);
        System.out.println("Example 3: " + result3); // Expected output: 1
    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int l = 0, r = 0;
        long total = 0;
        int n = nums.length;
        long ans = 0;

        for (r = 0; r < n; r++) {
            total = total + nums[r];

            while ((nums[r] * (r - l + 1)) > (total + k)) {
                total = total - nums[l];
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return (int) ans;
    }

}
