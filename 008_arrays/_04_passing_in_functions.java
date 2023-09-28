import java.util.Arrays;

public class _04_passing_in_functions {
    public static void main(String[] args) {
        int[] nums = {3,5,6,8};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
