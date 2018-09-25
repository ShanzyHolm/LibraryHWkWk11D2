import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
//    Library library;
    Books testBooks;
    Library myBookCollection;

    @Before
    public void before(){
        ArrayList<String> testBooks = new ArrayList<>();
        testBooks.add("CodeClan History");
        testBooks.add("Some Java in the morning");
        testBooks.add("Building SOLID foundations in code");
        testBooks.add("A guide to public coding libraries around the world");
//      testBooks = new Books("CodeClan History", "Ally", "historical non fiction"); //CANNOT GET WORKING - DO I NEED A HASH??
        myBookCollection = new Library(testBooks, 5);
    }

    @Test
    public void libraryHasBooks() {
        assertEquals(4, myBookCollection.libraryBookCount());
    }

//    @Test
//    public void canAddBookToLibraryStock() {
//        myBookCollection.addBook("Coding for Cats");
//        assertEquals(5, myBookCollection.libraryBookCount());
//    }

    @Test
    public void canGetLibraryCollectionCapacity() {
        assertEquals(5, myBookCollection.checkLibraryCapacity());
    }

    @Test
    public void canAddBookIfSpaceInCollection() {
        myBookCollection.addBook("Coding for Cats");
        assertEquals(5, myBookCollection.libraryBookCount());
    }

    @Test
    public void notAddBookIfAtCapacity() {
        myBookCollection.addBook("Coding for Cats");
        myBookCollection.addBook("How DRY is your code really?");
        assertEquals(5, myBookCollection.libraryBookCount());
    }
}
