public class _09_search_in_rotated_sorted_array_with_duplicate_values {
    public static void main(String[] args) {
        
    }

    static int search(int[] nums , int target){

        int pivot = findPivot(nums);

        // if no pivot exist 
        if(pivot == -1){
            // do normal binary search 
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found , you have found two asc sorted arrays 

        if(nums[pivot] == target){
            return pivot;
        }

        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
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
            
            // if elemnt at middle ,  start , end are equal then just skip the duplicate
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the dublicate 
                // note : what if these elements at start and end were the pivot ?
                // check if start is pivot 

                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return - 1;
    }
}
