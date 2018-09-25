//Write a method to count the number of books in the library.
//Write a method to add a book to the library stock.
//Add a capacity to the library and write a method to check if stock is full before adding a book.

import java.util.ArrayList;

public class Library {
    ArrayList<String> collection;
    int capacity;


    public Library(ArrayList<String> collection, int capacity){
        this.collection = collection;
        this.capacity = capacity;
    }

    public int libraryBookCount() {
        return this.collection.size();
    }

    public void addBook(String newBook) {
        if (libraryBookCount() < capacity) {
            this.collection.add(newBook);
        }
    }

    public int checkLibraryCapacity() {
        return this.capacity;
    }
}
