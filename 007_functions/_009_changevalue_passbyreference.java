import java.util.Arrays;

public class _009_changevalue_passbyreference {
    public static void main(String[] args) {
        
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 99;
    }
}
