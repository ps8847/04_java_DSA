import java.util.Scanner;

public class _19_q {
    public static void main(String[] args) {
        // 38. Take integer inputs till the user enters 0 and print the sum of all numbers

        Scanner in = new Scanner(System.in);

        int sum = 0;
        while(true){
            int num = in.nextInt();
            
            if(num == 0){
                break;
            }
            sum+=num;
            System.out.println("sum is : " + sum);
        }

        in.close();
    }
}
