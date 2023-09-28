import java.util.Arrays;

public class _04_Richest_Customer_Wealth {
    public static void main(String[] args) {
        
        int[][] vals = {{2,8,7},{7,1,3},{1,9,5}};
        int ans = largetssum(vals);
        System.out.println(ans);
       
    }

    public static int largetssum(int[][] nums) {

        int n = nums.length;
        int m = nums[0].length;

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum+=nums[i][j];
            }
            if(sum > largest){
                largest = sum;
            }
        }

        return largest;

    }
}
