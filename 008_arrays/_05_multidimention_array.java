import java.util.Arrays;
import java.util.Scanner;

public class _05_multidimention_array {
    public static void main(String[] args) {
        /*
         *      1 2 3
         *      4 5 6
         *      7 8 9
         */

        //  method 1 
        //  int[][] arr = new int[3][3];

        // method 2
        //  int[][] arr = {
        //     { 1 ,2 ,3},
        //     { 4 ,5 ,6},
        //     { 7 ,8 ,9}
        //  }

        //  method 3
        //  int[][] arr = new int[3][];

        // method 4
        //  int[][] arr = {
        //     { 1 ,2 ,3},
        //     { 4 ,5},
        //     { 6 ,7 ,8 ,9}
        //  }

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        // // method 1
        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[row].length; col++){
        //          System.out.print(arr[row][col]);
        //     }
        //     System.out.println(arr);
        // }

        // // method 2
        // for(int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr));
        // }

        // // output 3
        // for(int[] a : arr){
        //     System.out.println(Arrays.toString(a));
        // }

    }
}
