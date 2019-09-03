import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int bookCount(){
        return this.collection.size();
    }


    public void borrowBook(Book book) {
        this.collection.add(book);
    }

    public void canBorrowBookFromLibrary(Library library){
        if ( library.totalBooks() > 0 ){
            Book bookRemoved = library.removeBook();
            this.borrowBook(bookRemoved);
        }
    }

}
