import java.util.ArrayList;

public class _07_array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        // add
        list.add(67);
        list.add(46);
        list.add(456);
        list.add(354);

        System.out.println(list);
        System.out.println(list.contains(46));
        list.set(0,70);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
 