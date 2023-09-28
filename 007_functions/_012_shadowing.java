public class _012_shadowing {

    static int x = 100; // this will be shdowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 100
        int x = 50;
        System.out.println(x); // 50
        fun();

    }

    static void fun(){
        System.out.println(x);
    }
}
