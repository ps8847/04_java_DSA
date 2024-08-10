import java.util.ArrayList;
import java.util.List;

public class _30_Spiral_Matrix {
    public static void main(String[] args) {

        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> result1 = spiralOrder(matrix1);
        System.out.println(result1);

        int[][] matrix2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        List<Integer> result2 = spiralOrder(matrix2);
        System.out.println(result2);

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = n - 1; 
        int top = 0;
        int bottom = m - 1;

        while (m * n > ans.size()) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }

            if (top != bottom) {
                for (int i = right - 1; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
            }

            if (left != right) {

                for (int i = bottom - 1; i > top; i--) {
                    ans.add(matrix[i][left]);
                }
            }

            top++;
            bottom--;
            left++;
            right--;
        }

        return ans;
    }
}