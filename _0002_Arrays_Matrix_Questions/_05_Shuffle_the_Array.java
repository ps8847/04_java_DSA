import java.util.Arrays;

public class _05_Shuffle_the_Array {
    public static void main(String[] args) {

        int vals[] = { 2, 5, 1, 3, 4, 7 };

        int ans[] = shuffle(vals, 3);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {

            ans[i * 2] = nums[i];
            ans[i * 2 + 1] = nums[i + n];
        }

        return ans;
    }
}
