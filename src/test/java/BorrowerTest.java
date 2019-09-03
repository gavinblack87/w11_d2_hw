import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp(){
        borrower = new Borrower();
        book = new Book("Coding", "Gav", "Tech");
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canBorrowBookFromLibraryTest(){
        borrower.canBorrowBookFromLibrary(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.totalBooks());
    }
}
