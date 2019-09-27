package LibraryManagement;

public class IssuedBooks {

    private String uniqueID, bookName, custName, dateOfIssued;

    public IssuedBooks(String uniqueID, String bookName, String custName, String dateOfIssued) {
        this.uniqueID = uniqueID;
        this.bookName = bookName;
        this.custName = custName;
        this.dateOfIssued = dateOfIssued;
    }

    @Override
    public String toString() {
        return "IssuedBooks{" +
                "uniqueID='" + uniqueID + '\'' +
                ", bookName='" + bookName + '\'' +
                ", custName='" + custName + '\'' +
                ", dateOfIssued='" + dateOfIssued + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public String getCustName() {
        return custName;
    }
}
