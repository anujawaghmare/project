import java.util.Scanner;

public class ThirdAngleFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first two angles
        System.out.print("Enter the first angle: ");
        double angle1 = scanner.nextDouble();

        System.out.print("Enter the second angle: ");
        double angle2 = scanner.nextDouble();

        // Calculate the third angle
        double thirdAngle = 180 - (angle1 + angle2);

        // Display result
        if (thirdAngle > 0) {
            System.out.println("The third angle of the triangle is: " + thirdAngle + " degrees");
        } else {
            System.out.println("Invalid input! The sum of the two angles should be less than 180.");
        }
    }
}