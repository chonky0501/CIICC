package Task121;

public class MyDate {
    public static void main(String[] args) {
        // Create two DateTask objects
        DateTask date1 = new DateTask(1, 1, 1978);   // January 1, 1978
        DateTask date2 = new DateTask(21, 9, 1984);  // September 21, 1984

        // Display both dates
        System.out.println("Date 1: " + date1.displayDate());
        System.out.println("Date 2: " + date2.displayDate());

        // Check leap year for date2
        System.out.println("Is Date 2's year a leap year? " + date2.isLeapYear());
    }
}
