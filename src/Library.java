import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library that manages a collection of books.
 * Provides methods to add, find, and display books.
 *
 * @author Aziyusman Maulana
 * @version 1.0
 */
public class Library {
    private List<Book> books = new ArrayList<>();

    /**
     * Adds a new book to the library collection.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Finds a book in the library by its title.
     * @param title The title of the book to search for.
     * @return The book if found, or null if not found.
     */
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Displays all books available in the library.
     */
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
