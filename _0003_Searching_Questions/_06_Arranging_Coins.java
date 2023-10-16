public class _06_Arranging_Coins {
    public static void main(String[] args) {
        int n1 = 5;
        System.out.println("Number of complete rows for " + n1 + " coins: " + arrangeCoins(n1)); // Should print 2

        int n2 = 8;
        System.out.println("Number of complete rows for " + n2 + " coins: " + arrangeCoins(n2)); // Should print 3
    }

    // brute force
//     public static int arrangeCoins(int n) {
//         int i = 1;
//         while(n >= i){
//             n -= i;
//             i++;
//         }
//         return i - 1;
//    }

   // binary serahc
   public static int arrangeCoins(int n) {
    long start  = 0;
    long end = n;

    while(start <= end){
        long mid = start + (end - start) / 2;
        if(mid*(mid+1)/2 == n){
            return (int)mid;
        } else if(mid*(mid+1)/2 < n){
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return (int)end;
}


}
