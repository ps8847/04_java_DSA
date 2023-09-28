
public class _05_reverseof_number {
    public static void main(String[] args) {
        int num = 65645685;

        int ans = 0;

        while(num > 0){
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}
