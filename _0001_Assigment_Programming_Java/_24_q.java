import java.util.Scanner;

public class _24_q {
    public static void main(String[] args) {
        
        // 66. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

        Scanner in = new Scanner(System.in);

        int sumOfNegativeNumbers = 0 , sumOfPositiveEvenNumbers = 0 , sumOfPositiveOddNumbers = 0;

        while(true){
        
            int num = in.nextInt();

            if(num == 0){
                break;
            }
            if(num < 0){
                sumOfNegativeNumbers+=num;
            } else {
                if(num % 2 == 0){
                    sumOfPositiveEvenNumbers+=num;
                }
                if(num % 2 == 1){
                    sumOfPositiveOddNumbers+=num;
                }
            }
        }
        
        System.out.println("sumOfNegativeNumbers : " + sumOfNegativeNumbers + " , sumOfPositiveEvenNumbers : " + sumOfPositiveEvenNumbers + " , sumOfPositiveOddNumbers : " + sumOfPositiveOddNumbers);
    }
}
