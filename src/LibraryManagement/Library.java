package LibraryManagement;

public interface Library {
    public void addBooks(Book b);
    public void viewBooks();
    public void viewBookByCategory(String name);
    public void deleteBook(String bookName);
    public void issueBooks(String bookName,String custName);
    public void viewIssuedBooks();
    public void returnBook(String custName,String bookName);

}
