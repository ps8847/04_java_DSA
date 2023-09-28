public class _13_q {
    public static void main(String[] args) {
        
        //13. To find out whether the given String is Palindrome or not.

        String ans = "naman";

        boolean isPalindrome = ans.equals(new StringBuilder(ans).reverse().toString());

        System.out.println(isPalindrome ? "yes" : "no");
    }
}
