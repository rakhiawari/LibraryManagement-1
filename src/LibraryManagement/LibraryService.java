package LibraryManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class LibraryService {
    List<Book> bookList = new LinkedList<>();
    List<IssuedBooks> issuedBooksList = new LinkedList<>();
    List<IssuedBooks> returnBooksList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Added to list");
    }

    public void viewBooks() {
        for (Book e : bookList) {
            System.out.println(e.toString());
        }
    }

    public void viewBooksByAuthorName(Author authorName) {
        for (Book e: bookList) {
            if (e.getAuthorName().equals(authorName)) {
                System.out.println(e.toString());
            }
        }
    }
    public void viewBooksByBookTitle(String bookName) {
        for (Book e: bookList) {
            if (e.getBookName().equals(bookName)) {
                System.out.println(e.toString());
            }
        }
    }
    public void deleteBook(String bookName) {
        for (Book e: bookList) {
            if (e.getBookName().equals(bookName)) {
                bookList.remove(e);
            }
        }
    }

    public void issueBooks(String bookName, String custName) {
        for (Book e: bookList) {
            if (e.getBookName().equals(bookName)) {
                if (e.getBookQuantity() >= 1) {
                    String uniqueID = UUID.randomUUID().toString();
                    DateFormat df = new SimpleDateFormat("dd/MM/yy");
                    Date dateobj = new Date();
                    String dateOfIssue = df.format(dateobj);
                    IssuedBooks thisBook = new IssuedBooks(uniqueID, bookName, custName, dateOfIssue);
                    issuedBooksList.add(thisBook);
                    e.setBookQuantity(e.getBookQuantity()-1);
                    return;
                }
                else {
                    deleteBook(e.getBookName());
                }
            }
        }
        System.out.println("Book not available!");
    }


    public void viewIssuedBooks() {
        for (IssuedBooks e : issuedBooksList) {
            System.out.println(e.toString());
        }
    }

    public void returnBook(String custName, String bookName) {
        for (IssuedBooks e : issuedBooksList) {
            if ((e.getCustName().equals(custName)) && (e.getBookName().equals(bookName))) {
                issuedBooksList.remove(e);
                System.out.println("book returned successfully");
                return;
            } else {
                System.out.println("Book was not issued.");
                return;
            }
        }
    }
}
