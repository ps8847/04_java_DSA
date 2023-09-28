import java.util.Calendar;

public class _23_q {
    // 65. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

    public static void main(String[] args) {

        // 65. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August. 
        
        int year = 2023; // Change this to the desired year
        int daysInAugust = countEvenDays(year);

        System.out.println("Number of even days in August " + year + ": " + daysInAugust);
    }

    public static int countEvenDays(int year) {
        // August always has 31 days, and the even days are 2, 4, 6, 8, ... 30.
        // So, we can calculate the count of even days directly.

        int evenDays = 31 / 2; // 31 days divided by 2 equals 15.5 (integer division rounds down)

        return evenDays;
    }
}
