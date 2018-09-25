//Write a method to count the number of books in the library.
//Write a method to add a book to the library stock.
//Add a capacity to the library and write a method to check if stock is full before adding a book.

import java.util.ArrayList;

public class Library {
    ArrayList<String> collection;

    public Library(ArrayList<String> collection){
        this.collection = collection;
    }

    public int libraryBookCount() {
        return this.collection.size();
    }

    public void addBook(String newBook) {
        this.collection.add(newBook);
    }
}
