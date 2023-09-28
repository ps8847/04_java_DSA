import java.util.Arrays;

public class _07_Number_of_Good_Pairs {
    public static void main(String[] args) {
         int vals[] = {1,1,1,1};

        int ans = numIdenticalPairs(vals);

        System.out.println(ans);
    }

    public static int numIdenticalPairs(int[] nums) {
        
        int  numberofpairs = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    numberofpairs++;
                }
            }
        }

        return numberofpairs;
    }
}
