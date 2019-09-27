package LibraryManagement;

import java.util.Scanner;
import java.util.UUID;

public class UserMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String tempName;
        LibraryService libraryService = new LibraryService();

        do {
            System.out.println("1.Add Books\n2.View Book List\n3.View books by Author Name\n4.View books by Book " +
                    "Title\n5.Search Books by author Name\n6.Search Books by Book Title\n7.Issue Books\n8.View Issued" +
                    " Books\n9.Delete Books\n10.Return book\n0.Logout");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter book name:");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();

                    System.out.println("Enter author name");
                    tempName = scanner.nextLine();
                    Author authorName=new Author(tempName);
                    System.out.println("Enter book quantity");
                    int bookQuantity = scanner.nextInt();

                    String uniqueID = UUID.randomUUID().toString();
                    Book book = new Book(uniqueID, bookName, authorName, bookQuantity);

                    libraryService.addBook(book);
                    break;
                case 2:


                    libraryService.viewBooks();
                    break;
                case 3:
                    System.out.println("Enter Author name: ");
                    scanner.nextLine();
                    tempName=scanner.nextLine();
                    authorName=new Author(tempName);
                    libraryService.viewBooksByAuthorName(authorName);
                    break;
                case 4:
                    System.out.println("Enter book title: ");
                    scanner.nextLine();
                    bookName=scanner.nextLine();
                    libraryService.viewBooksByBookTitle(bookName);
                    break;
                case 5:
                    System.out.println("Enter Author name: ");
                    scanner.nextLine();
                    tempName=scanner.nextLine();
                    authorName=new Author(tempName);
                    libraryService.viewBooksByAuthorName(authorName);
                    break;
                case 6:
                    System.out.println("Enter book title: ");
                    scanner.nextLine();
                    bookName=scanner.nextLine();
                    libraryService.viewBooksByBookTitle(bookName);
                    break;
                case 7:
                    System.out.println("Enter book name: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    System.out.println("Enter customer name: ");
                    String custName = scanner.nextLine();

                    libraryService.issueBooks(bookName,custName);
                    break;
                case 8:
                    libraryService.viewIssuedBooks();
                    break;
                case 9:
                    System.out.println("Enter book name to be deleted: ");
                    bookName = scanner.nextLine();
                    libraryService.deleteBook(bookName);
                    break;
                case 10:
                     System.out.println("Enter customer name:");
                    scanner.nextLine();
                    custName=scanner.nextLine();
                    System.out.println("Enter book name:");
                    bookName=scanner.nextLine();
                    libraryService.returnBook(custName,bookName);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("INVALID choice.");
            }
        } while (choice != 0);

    }
}
