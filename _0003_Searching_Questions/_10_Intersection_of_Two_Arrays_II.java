import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _10_Intersection_of_Two_Arrays_II{
    public static void main(String[] args) {
        _10_Intersection_of_Two_Arrays_II solution = new _10_Intersection_of_Two_Arrays_II();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.intersect(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

        public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

  
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("countMap is");
        System.out.println(countMap);


        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                result.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        System.out.println("result is");
        System.out.println(result);

        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }

        return intersection;

    }
}