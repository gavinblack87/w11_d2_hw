import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private int capacity;
    private ArrayList<Book> bookCollection;

    public static void main(String[] args) {
        HashMap<String, Integer> byGenre = new HashMap<String, Integer>();

    }

    public Library(int capacity){
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();
    }

    public int totalBooks() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (this.totalBooks() < this.capacity ){
            this.bookCollection.add(book);
        }
    }

    public Book removeBook() {
        Book bookRemoved = null;
        if (this.totalBooks() > 0){
            bookRemoved = this.bookCollection.remove(0);
        }
        return bookRemoved;
    }




}
