import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class BookCollections
{
    private int bno;
    private String bname;
    private double bprice;

    BookCollections(int bno, String bname, double bprice)
    {
        this.bno = bno;
        this.bname = bname;
        this.bprice = bprice;
    }

    double getBprice()
    {
        return this.bprice;
    }

    BookCollections(){} // default constructor.

    @Override
    public String toString() {
        return (this.bno + " " + this.bname + " $" + this.bprice);
    }
}

class LibraryCollections
{
    Set<BookCollections> books;
    LibraryCollections()
    {
        books = new TreeSet<BookCollections>(new PriceComparator());
    }

    void addBooks(BookCollections b)
    {
        books.add(b);
    }

    void displayBooks()
    {
        for (BookCollections b : books)
            System.out.println(b); // invokes toString method, so we need to override it.
    }

}

// Because TreeSet needs to compare.
class PriceComparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        BookCollections b1 = (BookCollections) o1;
        BookCollections b2 = (BookCollections) o2;

        if (b1.getBprice() > b2.getBprice())
            return +1; // connect left
        else if(b1.getBprice() < b2.getBprice())
            return -1; // connect right
        else
            return 0;
    }
}

public class LibraryUsingCollections {

    public static void main(String[] args) {

        LibraryCollections li = new LibraryCollections();
        BookCollections b1 = new BookCollections(111,"Java",500.00);
        BookCollections b2 = new BookCollections(111,"HTML",200.00);
        BookCollections b3 = new BookCollections(111,"Spring",300.00);
        li.addBooks(b1); li.addBooks(b2); li.addBooks(b3);
        li.displayBooks();

        // Class cast exception is occuring because TreeSet doesn't know how to compare BookCollections objects.
    }
}
