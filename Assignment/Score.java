package Assignment;
import java.util.Scanner;


public class Score {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the student's score
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Determine grade based on score
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}

