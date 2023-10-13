public class _02_Search_in_Strictly_sorted_array {
    public static void main(String[] args) {
        // Example usage
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        int target = 16;
        int[] result = search(matrix, target);
        if (result[0] == -1) {
            System.out.println("Target not found in the matrix.");
        } else {
            System.out.println("Target found at row: " + result[0] + ", column: " + result[1]);
        }
    }

    public static int[] binarySearch(int[][] matrix, int row, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart <= rEnd) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid + 1;
            } else {
                rEnd = mid - 1;
            }
        }

        if (rStart < rows) {
            return binarySearch(matrix, rStart, 0, cols - 1, target);
        }

        return new int[]{-1, -1};
    }
}