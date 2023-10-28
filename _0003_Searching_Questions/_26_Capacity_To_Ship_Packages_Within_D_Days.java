public class _26_Capacity_To_Ship_Packages_Within_D_Days {
    public static void main(String[] args) {
        int[] weights1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int days1 = 5;
int result1 = shipWithinDays(weights1, days1);
System.out.println("Example 1: " + result1);

int[] weights2 = {3, 2, 2, 4, 1, 4};
int days2 = 3;
int result2 = shipWithinDays(weights2, days2);
System.out.println("Example 2: " + result2);

int[] weights3 = {1, 2, 3, 1, 1};
int days3 = 4;
int result3 = shipWithinDays(weights3, days3);
System.out.println("Example 3: " + result3);

    }

    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
    
        for (int weight : weights) {
            left = Math.max(left, weight); // The minimum capacity cannot be less than the maximum weight.
            right += weight; // The maximum capacity is the sum of all weights.
        }
    
        while (left < right) {
            int mid = left + (right - left) / 2;
            int currentDays = 1;
            int currentLoad = 0;
    
            for (int weight : weights) {
                if (currentLoad + weight > mid) {
                    currentDays++;
                    currentLoad = 0;
                }
                currentLoad += weight;
            }
    
            if (currentDays > days) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
    
        return left;
    }
    
}