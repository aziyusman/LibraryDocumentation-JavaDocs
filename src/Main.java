public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Clean Code", "Robert C. Martin"));
        library.addBook(new Book("Effective Java", "Joshua Bloch"));
        library.displayBooks();
    }
}
