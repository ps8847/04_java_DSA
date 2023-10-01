import java.util.Arrays;

public class _05_SearcH_in_2d_array {
    public static void main(String[] args) {
        
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12},
        };

        int target = 34;
        int[] ans = search2darray(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int [] search2darray(int[][] arr , int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};
    }

    public static int maxIn2dArray(int[][] arr){

        int max = Integer.MIN_VALUE;

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max  = arr[row][col];
                }
            }
        }

        return max;
    }

    public static int maxIn2dArray2(int[][] arr){

        int max = Integer.MIN_VALUE;

        for(int[] ints : arr){
            for(int element : ints){
                if(element > max){
                    max = element;
                }
            }
        }

        return max;
    }
}
