public class _35_Jump_Game {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        boolean result1 = canJump(nums1);
        System.out.println(result1); // Output: true

        int[] nums2 = {3, 2, 1, 0, 4};
        boolean result2 = canJump(nums2);
        System.out.println(result2); // Output: false
    }

    public static boolean canJump(int[] nums) {
        int reachable = 0;
       for(int i = 0; i < nums.length; i ++) {
           if(i > reachable) return false;
           reachable = Math.max(reachable, i + nums[i]);
       } 
       return true;
    }
}
