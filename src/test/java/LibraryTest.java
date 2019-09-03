import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;

    @Before
    public void before(){
        library = new Library(1);
        book = new Book("Coding", "Gav", "Tech");
        book2 = new Book("GP", "Amy", "Medical");

    }

    @Test
    public void libraryStartsAt0(){
        assertEquals(0, library.totalBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.totalBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book2);
        library.removeBook();
        assertEquals(0, library.totalBooks());
    }
}
