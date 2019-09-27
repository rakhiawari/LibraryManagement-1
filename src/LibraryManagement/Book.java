package LibraryManagement;

public class Book {
    private String uniqueID, bookName;
    private Author authorName;
    private int bookQuantity;
    public Book(String uniqueID, String bookName, Author authorName, int bookQuantity) {
        this.uniqueID = uniqueID;
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookQuantity=bookQuantity;
    }

    @Override
    public String toString() {
        return "Books{" +
                "uniqueID='" + uniqueID + '\'' +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookQuantity=" + bookQuantity +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }
}
