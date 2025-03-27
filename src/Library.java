import java.util.ArrayList;

public class Library {
    private ArrayList <Book> books;
    private ArrayList <User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Book findBook(String title) throws Exception {
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                return book;
            }
        }
        throw new Exception("Book not found: " + title);
    }

    public Book findBook(String title, String author) throws Exception {
        for (Book book : books) {
            if (book.getTitle().contains(title) && book.getAuthor().contains(author)) {
                return book;
            }
        }
        throw new Exception("Book not found: " + title + " by " + author);
    }


    public User findUser(String userId) throws Exception {
        for (User user : users) {
            if (user.getUserId().equalsIgnoreCase(userId)) {
                return user;
            }
        }
        throw new Exception("User not found: " + userId);
    }
}