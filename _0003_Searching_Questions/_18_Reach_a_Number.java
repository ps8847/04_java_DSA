public class _18_Reach_a_Number {
    public static void main(String[] args) {
        _18_Reach_a_Number solution = new _18_Reach_a_Number();

        int target1 = 2;
        System.out.println("Minimum moves for target " + target1 + ": " + solution.reachNumber(target1));

        int target2 = 3;
        System.out.println("Minimum moves for target " + target2 + ": " + solution.reachNumber(target2));
    }

    public int reachNumber(int target) {
        // Make target positive to simplify calculations
        target = Math.abs(target);

        int sum = 0;
        int moves = 0;

        while (sum < target || (sum - target) % 2 != 0) {
            moves++;
            sum += moves;
        }

        return moves;
    }
}
