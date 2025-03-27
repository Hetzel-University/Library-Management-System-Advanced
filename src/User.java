import java.util.ArrayList;

enum UserRole {STUDENT,FACULTY}

public class User {
    private String name;
    private String userId;
    private UserRole userRole;
    private ArrayList <Book> borrowedBooks;

    public User(String name, String userId, UserRole userRole) {
        this.name = name;
        this.userId = userId;
        this.userRole = userRole;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) throws Exception {
        if (book.isBorrowed()) {
            throw new Exception("Book is already borrowed: " + book.getTitle());
        }
        borrowedBooks.add(book);
        book.borrowBook();
        System.out.println("Book borrowed: " + book.getTitle());
    }

    public void returnBook(Book book) throws Exception {
        if (!borrowedBooks.contains(book)) {
            throw new Exception("Book not borrowed by user: " + userId);
        }
        borrowedBooks.remove(book);
        book.returnBook();
        System.out.println("Book returned: " + book.getTitle());
    }

    public String getUserId() {
        return userId;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}