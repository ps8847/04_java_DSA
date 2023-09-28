import java.util.Arrays;

public class _12_q {
    public static void main(String[] args) {
         
        // 12. To calculate Fibonacci Series up to n numbers.

        // method 1
        int n  = 15;

        int series[] = new int[n];

        series[0] = 0;
        series[1] = 1;

        for(int i = 2; i <n; i++){
            series[i] = series[i - 1] + series[i - 2];
        }

        System.out.println(Arrays.toString(series));

        // method 2

        int prev = 0;
        int next = 1;

        for(int i = 0; i < n; i++){
            System.out.print(prev + " ");
            int nextt = prev + next;
            prev = next;
            next = nextt;
        }
    }
}
