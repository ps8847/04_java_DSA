public class _01_basic_LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,16,-3,16,-11,28,35};
        int target = 16;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // serahc in he arrays return the index if item found
    // otherwise if item not found return -1

    public static int linearSearch(int[] arr , int target){
      
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int index = 0; index < arr.length; index++){
            // chekc for element at every index if it is == target 

            int element = arr[index];

            if(element == target){
                return index;
            }
            
        }

        // this line will be executed if none of the return statements above have executed
        //hence the target not found

        return Integer.MAX_VALUE;
    }

    public static int linearSearch2(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int element : arr){
            // chekc for element at every index if it is == target 
            if(element == target){
                return element;
            }
            
        }

        // this line will be executed if none of the return statements above have executed
        //hence the target not found

        return Integer.MAX_VALUE;
    }
}