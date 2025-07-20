import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();

        // Check if the number is non-negative
        if (number < 0) {
            System.out.println("Square root of a negative number is not defined for real numbers.");
        } else {
            // Calculate square root
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is: " + squareRoot);
        }
    }
}