public class _04_q {
    public static void main(String[] args) {
        // 4. Take 2 numbers as inputs and find their HCF and LCM.

        int num1 = 110;
        int num2 = 128;

        int gcd = findGCD(num1, num2);
        int lcm = (num1 * num2) / gcd;

        System.out.println("HCF (GCD) of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    static int findGCD(int a, int b) {
        int hcf = 0;
        for (int i = 1; i <= a || i <= b; i++)
        {
            if (a % i == 0 && b % i == 0)
          hcf = i;
        }
    
    return hcf;
    }
}
