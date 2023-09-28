import java.util.Scanner;

public class _02_alphabte_is_upper_or_lower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        } else {
            System.out.println("uppercase");
        }

        // or 

        System.out.println(ch >= 'a' && ch <= 'z' ? "lowwrcase" : "uppercase");
    }
}
