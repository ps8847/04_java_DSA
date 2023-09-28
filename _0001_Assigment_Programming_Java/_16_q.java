public class _16_q {
    public static void main(String[] args) {
        // 35. Fibonacci Series In Java Programs

        int n = 15;
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
