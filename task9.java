import static java.lang.Math.*;

public class task9 {

    // Addition using Math.addExact()
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Subtraction using Math.subtractExact()
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Multiplication using Math.multiplyExact()
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Division using Math.floorDiv() — returns float for decimal result
    public static float divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Float.NaN;
        }
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {

        int x = 20, y = 4;
        int p = 15, q = 7;

        System.out.println("=== Math Operations with Static Import ===\n");

        // Demo 1: using x and y
        System.out.println("Values: a = " + x + ", b = " + y);
        System.out.println("Addition       : " + add(x, y));
        System.out.println("Subtraction    : " + subtract(x, y));
        System.out.println("Multiplication : " + multiply(x, y));
        System.out.println("Division       : " + divide(x, y));

        System.out.println();

        // Demo 2: using p and q
        System.out.println("Values: a = " + p + ", b = " + q);
        System.out.println("Addition       : " + add(p, q));
        System.out.println("Subtraction    : " + subtract(p, q));
        System.out.println("Multiplication : " + multiply(p, q));
        System.out.println("Division       : " + divide(p, q));

        System.out.println();

        // Demo 3: division by zero
        System.out.println("Values: a = 10, b = 0");
        System.out.println("Division       : " + divide(10, 0));
    }
}