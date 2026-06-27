import java.util.Scanner;

public class task7 {

    // Method 1: Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method 2: Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method 3: Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method 4: Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n--- Results ---");
        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));

        scanner.close();
    }
}