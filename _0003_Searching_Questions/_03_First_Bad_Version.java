import java.util.Random;

public class _03_First_Bad_Version {
    public static void main(String[] args) {
        _03_First_Bad_Version solution = new _03_First_Bad_Version();
        int n = 5; // Replace with your desired 'n' and 'bad' values
        int firstBadVersion = solution.firstBadVersion(n);
        System.out.println("The first bad version is: " + firstBadVersion);
    }

    public boolean isBadVersion(int version) {
        Random rand = new Random();

        // Generate a random boolean value (true or false)
        return rand.nextBoolean();
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid)) {
                // If 'mid' is a bad version, move to the left half
                right = mid;
            } else {
                // If 'mid' is not a bad version, move to the right half
                left = mid + 1;
            }
        }

        // 'left' and 'right' will converge to the first bad version
        return left;
    }

}