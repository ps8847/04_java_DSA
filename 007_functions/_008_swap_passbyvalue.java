public class _008_swap_passbyvalue {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        swapp(a, b);  // will it swap ?

        System.out.println(a + " " + b);
    }

    static void swapp(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
