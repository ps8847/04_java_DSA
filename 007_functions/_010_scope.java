public class _010_scope {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;

        System.out.println(a);
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
