public class task8 {
    // Varargs method that processes each parameter
    public static int computeSum(int... numbers) {
        int totalSum = 0;

        System.out.println("--- Cumulative Sum for Each Parameter ---");

        for (int num : numbers) {
            int cumulativeSum = 0;

            // Compute sum from 1 to num (e.g., 4 = 1+2+3+4)
            System.out.print(num + " = (");
            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
                if (i < num) {
                    System.out.print(i + "+");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println(") = " + cumulativeSum);

            totalSum += cumulativeSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int result = computeSum(4, 5, 10);
        System.out.println("\nTotal Sum of All Parameters: " + result);
    }
}
