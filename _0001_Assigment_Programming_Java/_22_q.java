import java.util.Scanner;

public class _22_q {
    public static void main(String[] args) {
        // 45. Calculate Distance Between Two Points 

         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = scanner.nextDouble();

        scanner.close();

        double distance = calculateDistance(x1, y1, x2, y2);

        System.out.println("Distance between the two points: " + distance);
    }
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    }

