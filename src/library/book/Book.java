package library.book;

public class Book {
    public String bookId;
    public String title;
    public int quantity;

    public void showBook() {
        System.out.println("Book: " + bookId + " - " + title + " (Qty: " + quantity + ")");
    }
}
