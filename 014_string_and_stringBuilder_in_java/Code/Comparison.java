
public class Comparison {
    public static void main(String[] args) {
        String a = "Prince";
        String b = "Prince";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Prince");
        String name2 = new String("Prince");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}
