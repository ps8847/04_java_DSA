
public class _007_string_arguments {
    public static void main(String[] args) {
        
        String personalizedGreet = greet("prince");
        System.out.println(personalizedGreet);
    }

    static String greet(String name) {
        return "Hello" + name;
    }

}
