
public class _01_insertion_sort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
    
        System.out.println("Original array:");
        printArray(array);
    
        insertionSort(array);
    
        System.out.println("\nSorted array:");
        printArray(array);
    }
    
    // Function to perform insertion sort 2 on an array
    public static void insertionSort(int[] arr) {
       
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1);
                } else {
                    break;
                }
            }
        }

    }

    public static void swap(int[] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
       }

    
    // Function to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
}

