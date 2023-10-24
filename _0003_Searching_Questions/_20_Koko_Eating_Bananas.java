public class _20_Koko_Eating_Bananas {
    public static void main(String[] args) {
        _20_Koko_Eating_Bananas solution = new _20_Koko_Eating_Bananas();

        int[] piles1 = {3, 6, 7, 11};
        int h1 = 8;
        System.out.println("Example 1: " + solution.minEatingSpeed(piles1, h1));

        int[] piles2 = {30, 11, 23, 4, 20};
        int h2 = 5;
        System.out.println("Example 2: " + solution.minEatingSpeed(piles2, h2));

        int[] piles3 = {30, 11, 23, 4, 20};
        int h3 = 6;
        System.out.println("Example 3: " + solution.minEatingSpeed(piles3, h3));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
      int right = 0;

      for (int pile : piles) {
          right = Math.max(right, pile);
      }

      while (left < right) {
          int mid = left + (right - left) / 2;
          if (canEatAll(piles, h, mid)) {
              right = mid;
          } else {
              left = mid + 1;
          }
      }

      return left;
  }

  private static boolean canEatAll(int[] piles, int h, int k) {
      int hours = 0;
      for (int pile : piles) {
          hours += (pile + k - 1) / k; // Ceiling division
      }
      return hours <= h;
  }
}
