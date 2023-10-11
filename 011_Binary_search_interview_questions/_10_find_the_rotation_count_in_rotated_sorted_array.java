public class _10_find_the_rotation_count_in_rotated_sorted_array {
    public static void main(String[] args) {
        
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    public static int countRotations(int[] arr){

        int pivot = findPivot(arr);
        if(pivot == -1){
            // array is not rotated
            return 0;
        } else {
            return pivot + 1;
        }
    }

    static int binarySearch(int[] arr , int target , int start ,  int end){
        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
       }


    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // 4 cases 

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return - 1;
    }
}
