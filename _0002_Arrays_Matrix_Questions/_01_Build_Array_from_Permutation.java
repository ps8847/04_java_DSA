import java.util.Arrays;

public class _01_Build_Array_from_Permutation {
    public static void main(String[] args) {
        
        int vals[] = {0,2,1,5,3,4};

        int ans[] = buildArray(vals);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] buildArray(int[] nums) {

        int ans[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int val = nums[i];

            ans[i] = nums[val];
        }
        return ans;

    }
}
