import java.util.ArrayList;
import java.util.List;

public class _16_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] nums1 = {12, 345, 2, 6, 7896};
        int result1 = findNumbers(nums1);
        System.out.println("Output 1: " + result1); // Output: 2

        int[] nums2 = {555, 901, 482, 1771};
        int result2 = findNumbers(nums2);
        System.out.println("Output 2: " + result2); // Output: 1
    }

    // method 1 

    /*
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }

        return count;
    }

    public static boolean hasEvenDigits(int num) {

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count % 2 == 0;
    }
     */

    //method 2 

    /* 
     public static int findNumbers(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                list.add(String.valueOf(num));
            }
        }
        return list.size();
    }
    */

     //method 3

     
     public static int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((int)((Math.log10(nums[i])) + 1) % 2 == 0) result++;
        }
        return result;
    }


}
