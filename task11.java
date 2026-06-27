class Book {

    // Attributes
    String title;
    String author;
    int yearPublished;
    double price;

    // Constructor
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // toString method to display book details
    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
                "Author: \"" + author + "\"\n" +
                "Year Published: " + yearPublished + "\n" +
                "Price: $" + String.format("%.2f", price);
    }
}

public class task11 {

    public static void main(String[] args) {

        // Instantiate three Book objects
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print details of each book using toString()
        System.out.println("Book 1:");
        System.out.println(book1.toString());

        System.out.println("\nBook 2:");
        System.out.println(book2.toString());

        System.out.println("\nBook 3:");
        System.out.println(book3.toString());
    }
}