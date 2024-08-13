public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        int ans = floor(arr, 10);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }

        // If end becomes -1, it means there's no floor in the array for the target
        if (end >= 0) {
            return arr[end];
        } else {
            throw new IllegalArgumentException("No floor exists for the target in the array");
        }
    }
}
