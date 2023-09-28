public class _013_variable_length_arguments {
    public static void main(String[] args) {
        
        fun1(5,7,8,9,0,6);
        fun2(3,8,"a","b");

    }

    static void fun1(int ...a){
        
    }

    static void fun2(int a , int b , String ...c){

    }

    // static void fun3(int a ,String ...c, int b){  // will give error

    // }
}
