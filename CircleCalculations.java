import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculations
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Display results
        System.out.println("Diameter of the circle: " + diameter);
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);
    }
}