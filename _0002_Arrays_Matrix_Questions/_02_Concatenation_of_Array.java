
import java.util.Arrays;

public class _02_Concatenation_of_Array {
    public static void main(String[] args) {

        int vals[] = { 0, 1, 2 };

        int ans[] = buildArray(vals);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] buildArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }

        return ans;

    }
}
