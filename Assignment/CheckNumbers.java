import java.util.Scanner;

class CheckNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Check if zero first
        if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            // Positive or negative
            if (number > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is negative.");
            }
            
            // Odd or even
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }
    }
}
