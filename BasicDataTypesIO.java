import java.util.Scanner;

public class BasicDataTypesIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Float
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();

        // Double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        // Long
        System.out.print("Enter a long: ");
        long longValue = scanner.nextLong();

        // Short
        System.out.print("Enter a short: ");
        short shortValue = scanner.nextShort();

        // Byte
        System.out.print("Enter a byte: ");
        byte byteValue = scanner.nextByte();

        // Char
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);

        // Boolean
        System.out.print("Enter true or false: ");
        boolean booleanValue = scanner.nextBoolean();

        // String
        scanner.nextLine(); // Consume leftover newline
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        // Output all values
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Long: " + longValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Character: " + charValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("String: " + stringValue);
    }
}