import java.util.ArrayList;
import java.util.List;

public class _32_Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes1(matrix1);
        // setZeroes2(matrix1);
        printMatrix(matrix1);

        int[][] matrix2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes1(matrix2);
        // setZeroes2(matrix2);
        printMatrix(matrix2);
    }

    // brootofrce method
    public static void setZeroes1(int[][] matrix) {

        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i = 0; i < row.size(); i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[row.get(i)][j] = 0;
            }
        }

        for(int i = 0; i < col.size(); i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[j][col.get(i)] = 0;
            }
        }


    }


    public static void setZeroes2(int[][] matrix) {

    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
}
