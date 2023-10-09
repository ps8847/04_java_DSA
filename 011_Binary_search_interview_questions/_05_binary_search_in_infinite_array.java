public class _05_binary_search_in_infinite_array {
    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,90,100,130,140,160,170}; //suppose its inifinite
        int target = 10;
        System.out.println(ans(arr,target));
    }

    public static int ans(int[] arr , int target){

        //first find the range
        // first start with a box of size 2

        int start = 0;
        int end = 1;

        // condition for the target to lie in the range 

        while(target > arr[end]){

            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeOfbox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return search(arr,target,start,end);

    }

    public static int search(int[] nums, int target , int start , int end){

        while(start <= end){

            // find the middle element

            int mid = start + (end - start)/2;

            if(target < nums[mid])
            {
                end = mid - 1;
            } 
            else if(target > nums[mid])
            {
                start = mid + 1;
            } else 
            {
               return mid;
            }
        }
        return -1;
    }
}
