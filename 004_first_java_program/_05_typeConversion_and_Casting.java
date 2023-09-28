import java.util.Scanner;

public class _05_typeConversion_and_Casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        // float num = input.nextInt();   // we can do it because we can store small thing into big container
        // int num = input.nextFloat();   // we can't do it because we can't store big thing into small container

        // type casting forcefully  ( big data into small container)
        int num = (int)(67.67f);
        System.out.println(num);

        //automatic type promotion in expressions
        // int a = 254;
        // byte b = (byte)(a);

        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a + b / c;  // its automatcially converting bytes to int because its cnvertable

        // System.out.println(d);

        // byte b  = 50;
        // b = b + 2;   /// its not possible because it will change it to int . but the byte is not int for byte b

        int number  = 'a';
        System.out.println(number);

        // rules : byte , short , char vlaues converted to integer      .. means all the smaller data types will be converted to bigger ones
    }
}
