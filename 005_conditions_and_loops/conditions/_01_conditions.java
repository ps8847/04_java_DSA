import java.util.Scanner;

public class _01_conditions {
    public static void main(String[] args) {

        // example 1  if and else
        int salary = 25000;

        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }

        System.out.println(salary);

        // example 1  if and else if and else
        int salary1 = 25000;

        if (salary1 > 10000) {
            salary1 += 2000;
        } else if(salary1 >  20000){
            salary1 += 3000;
        } else {
            salary += 1000;
        }

        System.out.println(salary1);
    }
}
