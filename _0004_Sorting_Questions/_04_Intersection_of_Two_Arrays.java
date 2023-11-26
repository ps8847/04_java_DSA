import java.util.HashSet;

public class _04_Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result1 = intersection(nums1, nums2);
        System.out.print("Example 1 Output: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = intersection(nums3, nums4);
        System.out.print("Example 2 Output: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

     public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Add elements from nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }

        // Check for intersection with nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the HashSet to an array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }

        return result;
    }
}
