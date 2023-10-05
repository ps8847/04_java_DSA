
public class _02_OrderAgnostic_BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-18,-12,-4,0,2,3,4,15,17,22,45,89};

        int ans = orderAgnostic(arr, 15);
        System.out.println(ans);

    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
