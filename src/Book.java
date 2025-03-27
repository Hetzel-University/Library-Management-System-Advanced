enum BookType {FICTION,NON_FICTION}

public class Book {
    private String title;
    private String author;
    private BookType bookType;
    private boolean isBorrowed;

    public Book(String title, String author, BookType bookType) {
        this.title = title;
        this.author = author;
        this.bookType = bookType;
        this.isBorrowed = false;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
}