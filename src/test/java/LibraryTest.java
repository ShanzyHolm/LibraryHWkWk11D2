import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
//    Library library;
    Books books;
    Library myBookCollection;

    @Before
    public void before(){
        ArrayList<String> testBooks = new ArrayList<>();
        testBooks.add("CodeClan History");
        testBooks.add("Some Java in the morning");
        testBooks.add("Building SOLID foundations in code");
        testBooks.add("A guide to public coding libraries around the world");
        myBookCollection = new Library(testBooks);
    }

    @Test
    public void libraryHasBooks() {
        assertEquals(4, myBookCollection.libraryBookCount());
    }

    @Test
    public void canAddBookToLibraryStock() {
        myBookCollection.addBook("Coding for Cats");
        assertEquals(5, myBookCollection.libraryBookCount());
    }
}
