import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _09_Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
         int vals[] = {0,1,2,3,4};
         int index[] = {0,1,2,2,1};
        int ans [] = createTargetArray(vals,index);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = target.get(i);
        }

        return result;
    }
}
