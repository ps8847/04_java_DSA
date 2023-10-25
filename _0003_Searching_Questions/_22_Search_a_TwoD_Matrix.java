public class _22_Search_a_TwoD_Matrix {
    public static void main(String[] args) {
        _22_Search_a_TwoD_Matrix solution = new _22_Search_a_TwoD_Matrix();
        
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        
        int target1 = 3;
        int target2 = 13;
        
        boolean result1 = solution.searchMatrix(matrix, target1);
        boolean result2 = solution.searchMatrix(matrix, target2);
        
        System.out.println("Output 1: " + result1); // Expected output: true
        System.out.println("Output 2: " + result2); // Expected output: false
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0;
        int right = m * n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / n][mid % n];
            
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
}
