import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class _18_Add_to_Array_Form_of_Integer{
    public static void main(String[] args) {
        
         int[] num1 = {9,9,9,9,9,9,9,9,9,9};
        int k1 = 1;
        List<Integer> result1 = addToArrayForm(num1, k1);
        System.out.println("Output 1: " + result1); // Output: [1, 2, 3, 4]

        int[] num2 = {2, 7, 4};
        int k2 = 181;
        List<Integer> result2 = addToArrayForm(num2, k2);
        System.out.println("Output 2: " + result2); // Output: [4, 5, 5]

        int[] num3 = {2, 1, 5};
        int k3 = 806;
        List<Integer> result3 = addToArrayForm(num3, k3);
        System.out.println("Output 3: " + result3); // Output: [1, 0, 2, 1]

    }

    public static List<Integer> addToArrayForm(int[] num, int k) {

       StringBuilder atn = new StringBuilder();
        for (int digit : num) {
            atn.append(digit);
        }

        BigInteger bigNum = new BigInteger(atn.toString());
        BigInteger bigK = BigInteger.valueOf(k);
        BigInteger sum = bigNum.add(bigK);

        String sumStr = sum.toString();

        List<Integer> result = new ArrayList<>();
        for (char c : sumStr.toCharArray()) {
            result.add(Character.getNumericValue(c));
        }

        return result;
    }
}