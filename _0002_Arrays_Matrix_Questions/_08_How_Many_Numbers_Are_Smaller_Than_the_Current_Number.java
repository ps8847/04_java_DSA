import java.util.Arrays;

public class _08_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int vals[] = {8,1,2,2,3};

        int ans []= method1(vals);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] method1(int[] nums) {
        
        int ans [] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
               if(j != i && nums[j] < nums[i])
               {
                count++;
               }
            }
            ans[i] = count;
        }

        return ans;
    }

    public static int[] method2(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];
        
        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        
        System.out.println(Arrays.toString(count));
        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];    
        }
        System.out.println(Arrays.toString(count));
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else 
                res[i] = count[nums[i] - 1];
        }
        
        return res;        
    }
}
