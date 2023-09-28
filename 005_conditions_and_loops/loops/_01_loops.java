import java.util.Scanner;

public class _01_loops {
    public static void main(String[] args) {
        
        // print numbers form 1 to 5

        /*
         *System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
         * 
         */
        

         // for loop

         // print number from 1 to 5

        //  for (int num = 1; num  <= 5; num += 1){
        //     System.out.println(num);
        //  }

         // print number from 1 to n

        //  Scanner in = new Scanner(System.in);
        //  int n  = in.nextInt();

        //  for(int num = 1; num <= n; num += 1){
        //     System.out.print(num + " ");
        //  }


         // while loop

        //  int num = 1;
        //  while( num <= 5){
        //     System.out.println(num);
        //     num += 1;
        //  }


         // do while    .. it will do the things atleast one

         int n = 1;
         do{
            System.out.println(n);
            n++;
         } while( n <= 5);
         
    }
}
