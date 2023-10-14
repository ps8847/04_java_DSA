public class _02_Guess_Number_Higher_or_Lower {
    public static void main(String[] args) {
        _02_Guess_Number_Higher_or_Lower solution = new _02_Guess_Number_Higher_or_Lower();
        int n = 10; // Change this to your desired range.
        int result = solution.guessNumber(n);
        System.out.println("The picked number is: " + result);
    }

    private int guess(int num) {
        // Replace this with the actual implementation in your environment.
        // For testing purposes, return -1, 1, or 0 randomly.
        int pickedNumber = 6; // Change this to your picked number for testing.
        if (num < pickedNumber) {
            return 1;
        } else if (num > pickedNumber) {
            return -1;
        } else {
            return 0;
        }
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid; // We found the correct number
            } else if (result == -1) {
                right = mid - 1; // The picked number is smaller, search the left half
            } else {
                left = mid + 1; // The picked number is larger, search the right half
            }
        }

        return -1; // This line should never be reached, but it's needed to satisfy the compiler
    }


}
