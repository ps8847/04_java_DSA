public class _20_Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation {

    //revised 20
    public static void main(String[] args) {
        int[][] mat1 = {{0, 1}, {1, 0}};
        int[][] target1 = {{1, 0}, {0, 1}};
        System.out.println(canRotateToEqual(mat1, target1)); // Output: true

        int[][] mat2 = {{0, 1}, {1, 1}};
        int[][] target2 = {{1, 0}, {0, 1}};
        System.out.println(canRotateToEqual(mat2, target2)); // Output: false

        int[][] mat3 = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target3 = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(canRotateToEqual(mat3, target3)); // Output: true
    }

    public static boolean canRotateToEqual(int[][] mat, int[][] target) {

        // Check if the matrices have the same dimensions
        if (mat.length != target.length || mat[0].length != target[0].length) {
            return false;
        }

        // Try rotating the matrix 4 times (90, 180, 270, and 360 degrees)
        for (int rotate = 0; rotate < 4; rotate++) {
            // Check if the current matrix is equal to the target matrix
            if (isMatrixEqual(mat, target)) {
                return true;
            }

            // Rotate the matrix 90 degrees clockwise
            mat = rotateMatrix(mat);
        }

        return false;
    }

    // Function to rotate a matrix 90 degrees clockwise
    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][n - 1 - i] = matrix[i][j];
            }
        }

        return result;
    }

    // Function to check if two matrices are equal
    public static boolean isMatrixEqual(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        int m = mat1[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
