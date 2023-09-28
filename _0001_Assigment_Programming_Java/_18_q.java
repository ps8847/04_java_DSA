public class _18_q {
    // 37. Input a number and print all the factors of that number (use loops).

    public static void main(String[] args) {
        
        int num = 24;

        int i = 1;
        while(i <= num){

            if(num%i == 0){
                System.out.print(i + " , ");
            }
            i++;

        }
    }
}
