
import java.util.TreeSet;

public class _06_Third_Maximum_Number {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {3, 2, 1};
        System.out.println("Example 1: " + thirdMax(nums1));

        // Example 2
        int[] nums2 = {1, 2};
        System.out.println("Example 2: " + thirdMax(nums2));

        // Example 3
        int[] nums3 = {2, 2, 3, 1};
        System.out.println("Example 3: " + thirdMax(nums3));
    }

      public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);

            // Keep the set size to a maximum of 3
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }

        // If there are less than 3 distinct elements, return the maximum
        if (set.size() < 3) {
            return set.last();
        }

        // Otherwise, return the third maximum
        return set.first();
    }
}
