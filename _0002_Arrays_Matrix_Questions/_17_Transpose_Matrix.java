import java.util.Arrays;

public class _17_Transpose_Matrix {
    public static void main(String[] args) {
        
        int val[][] = {{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepToString(transpose(val)));
    }

    public static int[][] transpose(int[][] matrix) {
        
        int ans[][] = new int[matrix[0].length][matrix.length];
        
        System.out.println(Arrays.deepToString(ans));
        for(int i = 0; i < ans.length; i++){
            for(int j  = 0; j < ans[0].length; j++){
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }
}
