public class _38_House_Robber {

    public static void main(String[] args) {
        _38_House_Robber robber = new _38_House_Robber();
        
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {2, 7, 9, 3, 1};
        
        int result1 = robber.rob(nums1);
        int result2 = robber.rob(nums2);

        System.out.println("Example 1: " + result1); // Output: 4
        System.out.println("Example 2: " + result2); // Output: 12
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[] dp = new int[n];
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[n - 1];
    }
}