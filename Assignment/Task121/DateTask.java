package Task121;

public class DateTask {
    private int day;
    private int month;
    private int year;

    // No-args constructor
    public DateTask() {
        this(1, 1, 1); // default date
    }

    // Constructor with parameters
    public DateTask(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Display date in "12/12/2012" format
    public String setString() {
        return "12/12/2012";
    }

    // Getters and Setters with encapsulation rules
    public int getDay() {
        return day;
    }

    public int setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
            return day;
        } else {
            return 0;
        }
    }

    public int getMonth() {
        return month;
    }

    public int setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
            return month;
        } else {
            return 0;
        }
    }

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        if (year > 0) {
            this.year = year;
            return year;
        } else {
            return 0;
        }
    }

    // Utility method: check leap year
    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Display date in standard format
    public String displayDate() {
        return day + "/" + month + "/" + year;
    }
}
