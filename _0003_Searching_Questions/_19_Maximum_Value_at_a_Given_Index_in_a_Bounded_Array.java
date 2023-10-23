public class _19_Maximum_Value_at_a_Given_Index_in_a_Bounded_Array {
    public static void main(String[] args) {
        _19_Maximum_Value_at_a_Given_Index_in_a_Bounded_Array solution = new _19_Maximum_Value_at_a_Given_Index_in_a_Bounded_Array();
        System.out.println(solution.maxValue(4, 2, 6)); // Output: 2
        System.out.println(solution.maxValue(6, 1, 10)); // Output: 3
    }

    public static int maxValue(int n, int index, int maxSum) {
        int left = 0, right = maxSum - n;

        while (left < right) {
            int middle = (left + right + 1) / 2;
            if (isPossible(n, index, maxSum - n, middle))
                left = middle;
            else
                right = middle - 1;
        }
        return left + 1;
    }


    public static boolean isPossible(int n, int index, int maxSum, int value) {
        int leftValue = Math.max(value - index, 0);
        int rightValue = Math.max(value - ((n - 1) - index), 0);

        long sumBefore = (long) (value + leftValue) * (value - leftValue + 1) / 2;
        long sumAfter = (long) (value + rightValue) * (value - rightValue + 1) / 2;

        return sumBefore + sumAfter - value <= maxSum;
    }
}
