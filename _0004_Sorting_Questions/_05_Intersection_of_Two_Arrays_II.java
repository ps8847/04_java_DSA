import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class _05_Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result1 = intersect(nums1, nums2);
        System.out.println("Example 1 Output: " + java.util.Arrays.toString(result1));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = intersect(nums3, nums4);
        System.out.println("Example 2 Output: " + java.util.Arrays.toString(result2));
    }

     public static int[] intersect(int[] nums1, int[] nums2) {
     Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Populate frequency map for nums1
        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Check intersection with nums2 and update frequency map
        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                result.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        // Convert the List to an array
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
