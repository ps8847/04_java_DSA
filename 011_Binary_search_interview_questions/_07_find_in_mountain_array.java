public class _07_find_in_mountain_array {
    public static void main(String[] args) {
        
    }

    public static int search(int[] arr , int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnostic(arr , target , 0 , peak);
        if(firstTry != -1){
            return firstTry;
        } 

        return orderAgnostic(arr, target, peak+1, arr.length - 1);
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start  = mid + 1; 
            }
        }
        return start; 
    }

    public static int orderAgnostic(int[] arr, int target , int start , int end) {

        // find whether yhe array is sorted in accendin or decending
        boolean isAcc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAcc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;

    }
}