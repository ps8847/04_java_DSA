import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _30_Count_smaller_number_after_Self {
    public static void main(String[] args) {
        _30_Count_smaller_number_after_Self counter = new _30_Count_smaller_number_after_Self();

        int[] nums1 = { 5, 2, 6, 1 };
        List<Integer> result1 = counter.countSmaller(nums1);
        System.out.println(result1); // Output: [2, 1, 1, 0]
    }

    public List<Integer> countSmaller(int[] nums) {
        int len = nums.length;
        List<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int num : nums)
            arr.add(num);

        Collections.sort(arr);

        for (int i = 0; i < len; i++) {
            int index = binarySearch(arr, nums[i]);
            ans.add(index);
            arr.remove(index);
        }

        return ans;
    }

    public int binarySearch(ArrayList<Integer> arr, int target) {
        int start = 0;
        int end = arr.size() - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + ((end - start) / 2);
            int val = arr.get(mid);
            if (val < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        if (arr.get(start) == target)
            return start;
        return mid;
    }
}
