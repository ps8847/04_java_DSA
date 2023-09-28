public class _26_Reshape_the_Matrix {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {3, 4}};
        int r1 = 1;
        int c1 = 4;

        int[][] mat2 = {{1, 2}, {3, 4}};
        int r2 = 2;
        int c2 = 4;

        int[][] result1 = reshapeMatrix(mat1, r1, c1);
        int[][] result2 = reshapeMatrix(mat2, r2, c2);

        // Print the reshaped matrices
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(result1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result2[i][j] + " ");
            }
            System.out.println();
        }
    
    }

    public static int[][] reshapeMatrix(int[][] mat, int r, int c) {
        int m = mat.length; 
        int n = mat[0].length; 

        if (m * n != r * c) {
            return mat; 
        }

        int[][] reshapedMatrix = new int[r][c];
        int row = 0, col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshapedMatrix[row][col] = mat[i][j];
                col++;

                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return reshapedMatrix;
    }
}
