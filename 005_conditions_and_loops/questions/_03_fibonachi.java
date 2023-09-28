import java.util.Scanner;

public class _03_fibonachi {
    public static void main(String[] args) {
        
        // find the nth fibonachi number

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int data = 2;

       while(data <=n){
        int temp = b;
        b = b + a;
        a = temp;
        data++;
       }

        System.out.println(b);
    }
}
