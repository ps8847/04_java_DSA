import java.util.ArrayList;
import java.util.List;

public class _24_Lucky_Number_In_a_Matrix {
    public static void main(String[] args) {
         // Example 1
        int[][] matrix1 = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        List<Integer> result1 = luckyNumbers(matrix1);
        System.out.println(result1);  //

        // Example 2
        int[][] matrix2 = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        List<Integer> result2 = luckyNumbers(matrix2);
        System.out.println(result2);  //

        // Example 3
        int[][] matrix3 = {{7, 8}, {1, 2}};
        List<Integer> result3 = luckyNumbers(matrix3);
        System.out.println(result3);  //
            }

   public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            int minInRow = Integer.MAX_VALUE;
            int minInRowColumnIndex = -1;
            
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    minInRowColumnIndex = j;
                }
            }
            
            boolean isMaxInColumn = true;
            
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minInRowColumnIndex] > minInRow) {
                    isMaxInColumn = false;
                    break;
                }
            }
            
            if (isMaxInColumn) {
                result.add(minInRow);
            }
        }
        
        return result;
    }
}
