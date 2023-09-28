import java.util.Scanner;

public class _01_largetsof_three_numbers {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // ifnd the laregst of three numbers

        int max = a;
        if(b > max){
            max  = b;
        }
        if(c > max){
            max  = c;
        }

        System.out.println(max); // 

        // or 

        System.out.println( a > b ? a > c ? a : c : b);

        //or 
        
        System.out.println(Math.max(c , Math.max(a,b)));
    }
}
