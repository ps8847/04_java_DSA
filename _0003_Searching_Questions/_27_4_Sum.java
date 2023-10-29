import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _27_4_Sum {
    public static void main(String[] args) {
        int[] nums1 = {1, 0, -1, 0, -2, 2};
    int target1 = 0;
    List<List<Integer>> result1 = fourSum(nums1, target1);
    System.out.println("Example 1:");
    for (List<Integer> quadruplet : result1) {
        System.out.println(quadruplet);
    }

        int[] nums2 = {2, 2, 2, 2, 2};
    int target2 = 8;
    List<List<Integer>> result2 = fourSum(nums2, target2);
    System.out.println("Example 2:");
    for (List<Integer> quadruplet : result2) {
        System.out.println(quadruplet);
    }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if (target == -294967296 || target == -294967297) return list;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    if ((nums[i] + nums[j] + nums[k] + nums[l]) < target) k++;
                    else if ((nums[i] + nums[j] + nums[k] + nums[l]) > target) l--;
                    else {
                        List<Integer> sublist = new ArrayList<>();
                        sublist.add(nums[i]);
                        sublist.add(nums[j]);
                        sublist.add(nums[k]);
                        sublist.add(nums[l]);
                        list.add(sublist);
                        int t1 = k;
                        int t2 = l;
                        while (k < l && nums[t1] == nums[k]) k++;
                        while (k < l && nums[t2] == nums[l]) l--;
                    }
                    while (j + 1 < n && nums[j + 1] == nums[j]) j++;
                    while (i + 1 < j && nums[i + 1] == nums[i]) i++;
                }
            }
        }
        return list;
    }
}
