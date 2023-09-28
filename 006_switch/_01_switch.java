import java.util.Scanner;

public class _01_switch {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch(fruit){
            case "Mango":
            System.out.println("king of fruits");
            break;
            case "Orange":
            System.out.println("king2 of fruits");
            break;
            case "Apple":
            System.out.println("king3 of fruits");
            break;
            case "Grapes":
            System.out.println("king4 of fruits");
            break;
            default:
            System.out.println("enetr valid fruit");
        }

        // new syntax 
        switch(fruit){
            case "Mango" -> System.out.println("king of fruits");
            case "Orange" -> System.out.println("king2 of fruits");
            case "Apple" -> System.out.println("king3 of fruits");
            case "Grapes" -> System.out.println("king4 of fruits");
            default -> System.out.println("enetr valid fruit");
        }


        // display day betwene 1 to 7

        int day = in.nextInt();

         switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thurdsday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("enter valid number");
        }


        // tel weekend or weekday
         switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("weekday"); break;
            case 6:
            case 7:System.out.println("weekend");
            
        }

        //or 

         switch(day){
            case 1 ,2 , 3, 4, 5 -> System.out.println("weekday");
            case 6 , 7 -> System.out.println("weekend");
            
        }

    }
}
