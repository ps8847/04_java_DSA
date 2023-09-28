import java.util.Arrays;
import java.util.Scanner;

public class _02_array_printing_methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        // print method 1
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // print method 2
        for(int num : arr){
            System.out.print(num + " ");  // here num is element of array
        }

        // print method 3
        System.out.println(Arrays.toString(arr));
    }
}
