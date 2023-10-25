public class _23_Find_a_Peak_Element_II {
    public static void main(String[] args) {
        _23_Find_a_Peak_Element_II solution = new _23_Find_a_Peak_Element_II();
        
        int[][] mat1 = {
            {1, 4},
            {3, 2}
        };
        int[] result1 = solution.findPeakGrid(mat1);
        System.out.println("Output 1: [" + result1[0] + ", " + result1[1] + "]"); // Expected output: [0, 1]

        int[][] mat2 = {
            {10, 20, 15},
            {21, 30, 14},
            {7, 16, 32}
        };
        int[] result2 = solution.findPeakGrid(mat2);
        System.out.println("Output 2: [" + result2[0] + ", " + result2[1] + "]"); // Expected output: [1, 1]
    }

    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int left = 0;
        int right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int maxRow = 0;
            
            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }
            
            boolean isPeak = true;
            if (mid > 0 && mat[maxRow][mid] < mat[maxRow][mid - 1]) {
                right = mid - 1;
                isPeak = false;
            } else if (mid < n - 1 && mat[maxRow][mid] < mat[maxRow][mid + 1]) {
                left = mid + 1;
                isPeak = false;
            }
            
            if (isPeak) {
                return new int[]{maxRow, mid};
            }
        }
        
        return new int[]{-1, -1};
    }
}
