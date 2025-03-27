Übung Vertiefung Softwareentwicklung SS 2025

# Übung 02

## Library Management System

## Deadline What to submit?

## March 20 , 202 5 , 10:15 Java program code in zip file & Java

```
program code as a PDF file
```
## Objective:

The goal of this assignment is to implement a **Library Management System** in Java that
demonstrates the concepts of **Inheritance** , **Polymorphism** (Method Overloading and
Overriding), **Dynamic Binding** , and **Exception Handling**. You will also use **enums** and
**ArrayLists** to manage the library's collection of books and users.

## Tasks:

The Library Management System allows users to borrow and return books. The system
should also keep track of the books available in the library and the users who have
borrowed them. The system should support different types of users (e.g., Student, Faculty)
and different types of books (e.g., Fiction, Non-Fiction).

- **Classes and Enums:** [4 points]

```
Create the following classes and enums:
§ Book: Represents a book with aVributes like title, author, bookType (enum),
and isBorrowed.
§ User: Represents a generic user with aVributes like name, userId, userRole
(enum), and a list of borrowed books.
§ Student: A subclass of User with an additional aVribute studentId. Students
can borrow up to 3 books.
§ Faculty: A subclass of User with an additional aVribute facultyId. Faculty can
borrow up to 5 books.
§ Library: Manages the collection of books and users. It should have methods to
add books, add users, find books, and find users.
§ BookType (enum): Defines the types of books (e.g., FICTION, NON_FICTION).
§ UserRole (enum): Defines the roles of users (e.g., STUDENT, FACULTY).
```
- **Inheritance:** [ 2 points]

```
§ Use inheritance to create the Student and Faculty classes from the User class.
§ Override the borrowBook() method in Student and Faculty to enforce
different borrowing limits.
.
```

Übung Vertiefung Softwareentwicklung SS 2025

- **Polymorphism:** [ 2 points]

```
§ Use (method overloading) to implement a findBook() method in the Library
class that can search for a book by title or by both title and author.
§ Use (method overriding) to customize the behavior of the borrowBook() method
for Student and Faculty.
```
- **Exception Handling** : [ 4 points]

```
Implement custom exceptions to handle the following scenarios:
§ A user tries to borrow a book that is already borrowed.
§ A user tries to return a book they did not borrow.
§ A book or user is not found in the library.
§ A user exceeds their borrowing limit.
§ Use try-catch blocks in the main() method to handle these exceptions gracefully.
```
- **Dynamic Binding** : [ 2 points]

```
§ Use dynamic binding to call the appropriate borrowBook() method based on
whether the user is a Student or Faculty.
```
- **ArrayList: [** 2 points]

```
§ Use ArrayList to store the list of books and users in the Library class.
```
- **Main Class** : [8 points]

```
Create a Main class to test your implementation.
§ Add at least 2 books and 2 users (1 student and 1 faculty) to the library.
§ Simulate borrowing and returning books
```
- A student borrowing and returning a book.
- A faculty borrowing and returning a book.
  § Handling exceptions for:
- Borrowing an already borrowed book.
- Returning a book not borrowed by the user.
- Searching for a book or user that does not exist.
- Exceeding the borrowing limit.
- **Example Output:**

```
Book borrowed: 1984
Book borrowed: Sapiens
Error: Book is already borrowed: Sapiens
Book returned: 1984
Book returned: Sapiens
Error: Book not borrowed by user: F
```

