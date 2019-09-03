import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Coding", "Gav", "Tech");
    }

    @Test
    public void beforeTest(){
        assertEquals("Coding", book.getTitle());
        assertEquals("Gav", book.getAuthor());
        assertEquals("Tech", book.getGenre());

    }
}
