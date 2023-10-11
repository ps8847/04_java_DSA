public class _06_peakIndex_in_mountain_array {
    public static void main(String[] args) {
        
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                // you are in decreasing part in array
                // this may be the ans, but look at the left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start  = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        // in th end , start === end and pointing to the largest number because of the 2 checks above
        // start and end are always tring to find the max element in the above 2 checks 
        // hence , when they are pointing to just one element  ,that is the max one because that is what the checks say

        // more ellaboration : at every point of time for start and end , they have the best possible answer till that time .. and if we are saying that only one item is remaining  ,hence cuz of above line that is the best possible answer

        return start; // return start or end because both ar equal in the end
    }
}
