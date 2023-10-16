public class _04_Two_Sum_II_Input_array_is_sorted {
    public static void main(String[] args) {

        _04_Two_Sum_II_Input_array_is_sorted solution = new _04_Two_Sum_II_Input_array_is_sorted();

        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(numbers1, target1);
        System.out.println("Example 1: Indices of two numbers that add up to " + target1 + ": [" + result1[0] + ", " + result1[1] + "]");

        int[] numbers2 = {2, 3, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(numbers2, target2);
        System.out.println("Example 2: Indices of two numbers that add up to " + target2 + ": [" + result2[0] + ", " + result2[1] + "]");

        int[] numbers3 = {-1, 0};
        int target3 = -1;
        int[] result3 = solution.twoSum(numbers3, target3);
        System.out.println("Example 3: Indices of two numbers that add up to " + target3 + ": [" + result3[0] + ", " + result3[1] + "]");
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
    
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // Adding 1 to get 1-indexed indices
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        // If no solution is found, return an empty array or throw an exception as needed.
        return new int[]{};
    }

    
}
