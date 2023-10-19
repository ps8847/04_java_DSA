import java.util.HashSet;
import java.util.Set;

public class _11_Fair_Candy_Swap {
    public static void main(String[] args) {
        _11_Fair_Candy_Swap solution = new _11_Fair_Candy_Swap();

        // Example 1
        int[] aliceSizes1 = {1, 1};
        int[] bobSizes1 = {2, 2};
        int[] result1 = solution.fairCandySwap(aliceSizes1, bobSizes1);
        System.out.println("Example 1 Output: [" + result1[0] + ", " + result1[1] + "]");

        // Example 2
        int[] aliceSizes2 = {1, 2};
        int[] bobSizes2 = {2, 3};
        int[] result2 = solution.fairCandySwap(aliceSizes2, bobSizes2);
        System.out.println("Example 2 Output: [" + result2[0] + ", " + result2[1] + "]");

        // Example 3
        int[] aliceSizes3 = {2};
        int[] bobSizes3 = {1, 3};
        int[] result3 = solution.fairCandySwap(aliceSizes3, bobSizes3);
        System.out.println("Example 3 Output: [" + result3[0] + ", " + result3[1] + "]");
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int aliceTotal = 0;
    int bobTotal = 0;
    
    // Calculate the total number of candies Alice and Bob have
    for (int size : aliceSizes) {
        aliceTotal += size;
    }
    
    for (int size : bobSizes) {
        bobTotal += size;
    }
    
    int target = (aliceTotal + bobTotal) / 2;
    
    // Create a set of Bob's candy sizes for quick lookup
    Set<Integer> bobSet = new HashSet<>();
    for (int size : bobSizes) {
        bobSet.add(size);
    }
    
    // Iterate through Alice's candies to find the difference
    for (int size : aliceSizes) {
        int diff = target - (aliceTotal - size);
        
        // Check if Bob has a candy of this size
        if (bobSet.contains(diff)) {
            return new int[]{size, diff};
        }
    }
    
    return new int[]{0, 0}; // Return a default value (it is guaranteed that an answer exists)
}

}
