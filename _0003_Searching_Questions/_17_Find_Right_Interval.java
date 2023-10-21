import java.util.Arrays;
import java.util.TreeMap;

public class _17_Find_Right_Interval {
    public static void main(String[] args) {
        int[][] intervals1 = {{1, 2}};
int[] result1 = findRightInterval(intervals1); // Output: [-1]
System.out.println(Arrays.toString(result1));

int[][] intervals2 = {{3, 4}, {2, 3}, {1, 2}};
int[] result2 = findRightInterval(intervals2); // Output: [-1, 0, 1]
System.out.println(Arrays.toString(result2));

int[][] intervals3 = {{1, 4}, {2, 3}, {3, 4}};
int[] result3 = findRightInterval(intervals3); // Output: [-1, 2, -1]
System.out.println(Arrays.toString(result3));

    }

    public static int[] findRightInterval(int[][] intervals) {
      int n = intervals.length;
    int[] result = new int[n];
    TreeMap<Integer, Integer> startMap = new TreeMap<>();

    for (int i = 0; i < n; i++) {
        startMap.put(intervals[i][0], i);
    }

    for (int i = 0; i < n; i++) {
        int end = intervals[i][1];
        Integer rightIntervalIndex = startMap.ceilingKey(end);

        if (rightIntervalIndex != null) {
            result[i] = startMap.get(rightIntervalIndex);
        } else {
            result[i] = -1;
        }
    }

    return result;
    }

}
