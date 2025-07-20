import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the side length
        System.out.print("Enter the side length of the equilateral triangle: ");
        double side = scanner.nextDouble();

        // Calculate area
        double area = (Math.sqrt(3) / 4) * side * side;

        // Display the result
        System.out.println("Area of the equilateral triangle is: " + area);
    }
}