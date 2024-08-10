import java.util.Arrays;

public class _33_Product_of_Array_Except_Self {
    public static void main(String[] args) {
        
        _33_Product_of_Array_Except_Self solution = new _33_Product_of_Array_Except_Self();
        
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solution.productExceptSelf1(nums1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // int[] nums2 = {-1, 1, 0, -3, 3};
        // int[] result2 = solution.productExceptSelf(nums2);
        // for (int num : result2) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();

    }

    // brute force method
    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        
        int[] result = new int[n];
    
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
        
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        
        return result;
    }
    // brute force method
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];
         
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
    }


}
