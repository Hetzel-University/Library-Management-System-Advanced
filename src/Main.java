public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Investment Punk", "Gerald Hörhan", BookType.NON_FICTION);
        Book b2 = new Book("Was ist Management", "Peter Drucker", BookType.NON_FICTION);
        Book b3 = new Book("I am a Book", "Book author", BookType.FICTION);
        Book b4 = new Book("Rick and Morty", "Jerry", BookType.FICTION);
        Student s = new Student("Alex", "s1", "k12435924");
        Faculty f = new Faculty("Andi", "f1", "k23405982");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addUser(s);
        library.addUser(f);

        try {
            s.borrowBook(b1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            f.borrowBook(b2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            f.borrowBook(b2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            s.returnBook(b1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            f.returnBook(b2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            f.returnBook(b1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Book searchResult = library.findBook("Investment");
            System.out.println("Book found: " + searchResult.getTitle());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Book searchResult = library.findBook("Investment Punk", "Gerald");
            System.out.println("Book by author " +searchResult.getAuthor()+ " found: " + searchResult.getTitle());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            User searchResult = library.findUser("Invalid");
            System.out.println("User found: " + searchResult.getUserId());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            s.borrowBook(b1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            s.borrowBook(b2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            s.borrowBook(b3);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            s.borrowBook(b4);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}