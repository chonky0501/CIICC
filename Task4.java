public class Task4 {
    public static void main(String[] args) {
        String input = "madam"; // you can change this to test other strings

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Compare input and reversed string
        if (input.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
