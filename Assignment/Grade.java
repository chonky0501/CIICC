import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a score
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Decide the grade based on the score
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Show the result
        System.out.println("The grade is: " + grade);

        scanner.close();
    }
}


