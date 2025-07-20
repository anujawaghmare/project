import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length in centimeters
        System.out.print("Enter length in centimeters: ");
        double centimeters = scanner.nextDouble();

        // Convert to meters and kilometers
        double meters = centimeters / 100;
        double kilometers = centimeters / 100000;

        // Display the results
        System.out.println("Length in meters: " + meters);
        System.out.println("Length in kilometers: " + kilometers);
    }
}