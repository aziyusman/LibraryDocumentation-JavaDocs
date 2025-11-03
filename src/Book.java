/**
 * Represents a book entity in the library system.
 * Each book has a title, an author, and a borrowed status.
 *
 * @author Aziyusman Maulana
 * @version 1.0
 */
public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    /**
     * Constructs a new Book with the specified title and author.
     * @param title The title of the book.
     * @param author The author of the book.
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    /**
     * Marks the book as borrowed.
     */
    public void borrow() {
        isBorrowed = true;
    }

    /**
     * Marks the book as returned.
     */
    public void returnBook() {
        isBorrowed = false;
    }

    /**
     * Checks if the book is currently borrowed.
     * @return true if the book is borrowed, false otherwise.
     */
    public boolean isBorrowed() {
        return isBorrowed;
    }

    /**
     * Retrieves the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retrieves the author of the book.
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }
}
