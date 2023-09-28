public class _011_block_scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        {
            a = 70;
            int c = 90;
        }

        // System.out.println(c); // iwll give error
    }
}
