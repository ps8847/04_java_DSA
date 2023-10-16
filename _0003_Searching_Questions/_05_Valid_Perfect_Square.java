public class _05_Valid_Perfect_Square {
    public static void main(String[] args) {
        int num1 = 16;
        System.out.println("Is " + num1 + " a perfect square? " + isPerfectSquare(num1)); // Should print "true"

        int num2 = 14;
        System.out.println("Is " + num2 + " a perfect square? " + isPerfectSquare(num2)); // Should print "false"
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
           return true; 
       }

       long left = 2;
       long right = num / 2;

       while (left <= right) {
           long mid = left + (right - left) / 2;
           long square = mid * mid;

           if (square == num) {
               return true;
           } else if (square < num) {
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }

       return false;
   }

}
