

public class _04_count_occurances {
    public static void main(String[] args) {
        
        int n = 1385757879;

        int occurences = 0;

        while(n > 0){
            int rem = n % 10;  // will give last digit
            if(rem == 7){
                occurences++;
            }
            n = n/10; // will remove that last digit
        }

        System.out.println(occurences);
    }
}
