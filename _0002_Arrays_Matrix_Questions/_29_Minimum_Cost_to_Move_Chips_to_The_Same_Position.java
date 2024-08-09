import java.util.Arrays;

public class _29_Minimum_Cost_to_Move_Chips_to_The_Same_Position{

    public static void main(String[] args) {
        _29_Minimum_Cost_to_Move_Chips_to_The_Same_Position solution = new _29_Minimum_Cost_to_Move_Chips_to_The_Same_Position();

        int[] position1 = {1, 2, 3};
        System.out.println(solution.minCostToMoveChips(position1)); // Output: 1

        int[] position2 = {2, 2, 2, 3, 3};
        System.out.println(solution.minCostToMoveChips(position2)); // Output: 2

        int[] position3 = {1, 1000000000};
        System.out.println(solution.minCostToMoveChips(position3)); // Output: 1
    }

    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        for (int chipPosition : position) {
            System.out.println("positon is : " + Arrays.toString(position));
            System.out.println("chipPosition : " + chipPosition);
            if (chipPosition % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return Math.min(evenCount, oddCount);
    }
}