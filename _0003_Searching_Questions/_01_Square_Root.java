public class _01_Square_Root {
    
    public static void main(String[] args) {
        _01_Square_Root solution = new _01_Square_Root();
        System.out.println(solution.mySqrt(4)); // Output: 2
        System.out.println(solution.mySqrt(8)); // Output: 2
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long left = 1;   // Initialize the left boundary for binary search
        long right = x;  // Initialize the right boundary for binary search

        while (left <= right) {
            long mid = left + (right - left) / 2; // Calculate the middle value

            if (mid * mid == x) {
                return (int) mid; // If mid * mid is exactly equal to x, return mid as the square root
            } else if (mid * mid < x) {
                left = mid + 1; // If mid * mid is less than x, move the left boundary to mid + 1
            } else {
                right = mid - 1; // If mid * mid is greater than x, move the right boundary to mid - 1
            }
        }

        // When the loop ends, right will be less than left, so return right as the integer square root
        return (int) right;
    }
}
