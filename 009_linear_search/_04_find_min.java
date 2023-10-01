
public class _04_find_min {
    public static void main(String[] args) {
        
        int[] arr = {23,45,1,2,16,-3,16,-11,28,35};
        System.out.println(minNum(arr));
    }

    public static int minNum(int[] arr){

        int ans = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }

        return ans;
    }
}
