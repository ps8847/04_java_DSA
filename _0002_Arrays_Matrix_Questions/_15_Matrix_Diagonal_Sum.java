public class _15_Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        
        int mat [][] = {{1,2,3},
        {4,5,6},
        {7,8,9}};

        System.out.println(diagonalSum(mat));

    }

    public static int diagonalSum(int[][] mat) {
        
        int sum = 0;
        int n = mat.length; // Assuming square matrix

        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // Add the element on the primary diagonal
            sum += mat[i][n - 1 - i]; // Add the element on the secondary diagonal
        }

        // If the matrix has an odd number of rows and columns, subtract the center element once
        if (n % 2 == 1) {
            int center = mat[n / 2][n / 2];
            sum -= center;
        }

        return sum;
    }

}
