public class _014_functionoverloading {
    public static void main(String[] args) {
        fun(10);
        fun("heyy");
        sum(5,5);
        sum(5,5 , 5);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }

    static void sum(int a , int b){
        System.out.println(a+b);
    }

    static void sum(int a , int b , int c){
        System.out.println(a+b+c);
    }
}
