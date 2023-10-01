
public class _03_searchInRange {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,16,-3,16,-11,28,35};
        int target = 16;
        int ans = linearSearch(nums, target , 1, 4);
        System.out.println(ans);
    }

    public static int linearSearch(int[] arr , int target , int start  ,int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start; index <= end; index++){

            int element = arr[index];

            if(element == target){
                return index;
            }
            
        }

        return Integer.MAX_VALUE;
    }
}
