import java.util.HashSet;
import java.util.Set;

public class _12_Check_If_N_and_Its_Double_Exist {
    public static void main(String[] args) {
        _12_Check_If_N_and_Its_Double_Exist solution = new _12_Check_If_N_and_Its_Double_Exist();

        // Example 1
        int[] arr1 = {10, 2, 5, 3};
        boolean result1 = solution.checkIfExist(arr1);
        System.out.println("Example 1 Output: " + result1);

        // Example 2
        int[] arr2 = {3, 1, 7, 11};
        boolean result2 = solution.checkIfExist(arr2);
        System.out.println("Example 2 Output: " + result2);
    }

      public static boolean checkIfExist(int[] arr) {
         Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
          
            if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }
}
