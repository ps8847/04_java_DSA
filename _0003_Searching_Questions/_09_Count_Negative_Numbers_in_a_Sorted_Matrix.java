public class _09_Count_Negative_Numbers_in_a_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] grid1 = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        int result1 = countNegatives(grid1);

        int[][] grid2 = {
            {3, 2},
            {1, 0}
        };
        int result2 = countNegatives(grid2);

        System.out.println("Output 1: " + result1); // Output: 8
        System.out.println("Output 2: " + result2); // Output: 0
    }

    // optimized
    public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int row = rows - 1;
        int col = 0;

        while (row >= 0 && col < cols) {
            if (grid[row][col] < 0) {
                count += (cols - col); // All numbers to the right are also negative
                row--; // Move up to the next row
            } else {
                col++; // Move right within the same row
            }
        }

        return count;
    }

    // brute force
    // public static int countNegatives(int[][] grid) {
    //     int count = 0;
    //     int rows = grid.length;
    //     int cols = grid[0].length;

    //     for (int row = 0; row < rows; row++) {
    //         for (int col = 0; col < cols; col++) {
    //             if (grid[row][col] < 0) {
    //                 count++;
    //             }
    //         }
    //     }

    //     return count;
    // }
}
