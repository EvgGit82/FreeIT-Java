package library.db_commands;

import library.entity_classes.Book;
import library.entity_classes.Library;

import java.util.Iterator;

public class DeleteBook {

    int bookId;

    public DeleteBook(int bookId) {
        this.bookId = bookId;
    }

    public void execute () {
        Iterator<Book> booksIterator = Library.getInstance().getBooksList().iterator();
        int initialListSize = Library.getInstance().getBooksList().size();

        while (booksIterator.hasNext()){
            Integer id = booksIterator.next().getId();

            if(id == bookId){
                booksIterator.remove();
                System.out.println("Book deleted.");
            }
        }

        if (initialListSize == Library.getInstance().getBooksList().size()){
            System.out.println("Delete failed. Wrong id.");
        }
    }
}
