import java.util.Scanner;

public class _02_nested_switch {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch(empId){
            case 1:
            System.out.println("kunal khushwaha");
            case 2:
            System.out.println("Rahul rana");
            case 3:
            switch(department){
                case "IT":
                System.out.println("IT department");
                break;
                case "Management":
                System.out.println("Management department");
                break;
                default:
                System.out.println("no department");
            }break;
            default:
            System.out.println("enter valid id");
        }
    }
}
