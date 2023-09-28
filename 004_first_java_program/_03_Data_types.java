import java.util.Scanner;

public class _03_Data_types {
    public static void main(String[] args) {
        
        // premeitive datatype is a data type which we cant break further :  followng all are premitive
        // int rollno = 64;
        // char letter = 'r';
        // float marks = 87.67f;
        // double largeDecimalNumbers = 345325.74632665;
        // long largeInteger = 7465874568328653L;
        // boolean check = false;

        Scanner input  = new Scanner(System.in);
        // int rollno = input.nextInt();
        // System.out.println("Your rll number is : " + rollno);

        //to print 234 million
        int a = 234_000_000;
        System.out.println(a);

        String name = input.next();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
