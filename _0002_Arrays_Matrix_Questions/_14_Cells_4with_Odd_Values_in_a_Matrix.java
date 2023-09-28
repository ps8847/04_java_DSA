import java.util.Arrays;

public class _14_Cells_4with_Odd_Values_in_a_Matrix {
    public static void main(String[] args) {
        
        int m = 2, n = 3;
          int indices[][] = {{0,1},{1,1}};
        System.out.println(oddCells(m , n , indices));

    }

    public static int oddCells(int m, int n, int[][] indices) {

        int [][] ans  = new int[m][n];

        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];
            
       
            for (int i = 0; i < m; i++) {
                ans[i][col]++;
            }
            for (int j = 0; j < n; j++) {
                ans[row][j]++;
            }
        }

        int odd = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] % 2 != 0) {
                    odd++;
                }
            }
        }

        

        return odd;
    }
}
