public class Faculty extends User {
    private String facultyId;

    public Faculty(String name, String userId, String facultyId) {
        super(name, userId, UserRole.FACULTY);
        this.facultyId = facultyId;
    }

    @Override
    public void borrowBook(Book book) throws Exception {
        if (getBorrowedBooks().size() >= 5) {
            throw new Exception("Borrowing limit exceeded for faculty: " + getUserId());
        }
        super.borrowBook(book);
    }
}