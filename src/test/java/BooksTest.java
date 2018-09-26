import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {
//    Library library;
//    Borrower borrower;
    Books books;

    @Before
    public void before(){
        books = new Books("CodeClan History", "Ally", "historical nonfiction");
    }

    @Test
    public void canGetBookTitle() {
        assertEquals("CodeClan History", books.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Ally", books.getAuthor());
    }

    @Test
    public void canGetBookGenre() {
        assertEquals("historical nonfiction", books.getGenre());
    }

}
