import java.util.Arrays;

public class _03_Running_Sum_of_1d_Array {
    public static void main(String[] args) {
         int vals[] = {1,2,3,4};

        int ans[] = buildArray(vals);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] buildArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i-1]+nums[i];
        }

        return ans;

    }
}
