public class Student extends User {
    private String studentId;

    public Student(String name, String userId, String studentId) {
        super(name, userId, UserRole.STUDENT);
        this.studentId = studentId;
    }

    @Override
    public void borrowBook(Book book) throws Exception {
        if (getBorrowedBooks().size() >= 3) {
            throw new Exception("Borrowing limit exceeded for student: " + getUserId());
        }
        super.borrowBook(book);
    }
}