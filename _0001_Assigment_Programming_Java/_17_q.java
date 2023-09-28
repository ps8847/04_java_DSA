public class _17_q {
    public static void main(String[] args) {
        // 36. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)

        int num = 4422;

        int sum = 0;
        int mul = 1;
        while(num > 0){
            int rem = num % 10;  // will give last digit
            sum+=rem;
            mul*=rem;
            num = num/10; // will remove that last digit
         
        }

       System.out.println(mul-sum);
    }
}
