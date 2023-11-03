import java.util.Arrays;

public class _01_selectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1 , 6 ,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

   static void selectionSort(int[] arr){
    for(int i = 0; i < arr.length; i++){
        int last = arr.length - i - 1;
        int maxIndex = getMaxIndex(arr , 0 , last);
        swap(arr , maxIndex , last);
    }
   }

   public static void swap(int[] arr , int start , int end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
   }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
