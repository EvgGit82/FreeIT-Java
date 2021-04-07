package library.db_commands;

import library.entity_classes.Book;
import library.entity_classes.Library;

import java.util.Iterator;

public class EditBook {

    Book bookToEdit;

    public EditBook(Book bookToEdit) {
        this.bookToEdit = bookToEdit;
    }

    public void execute(){

        Iterator<Book> iterator = Library.getInstance().getBooksList().iterator();

        while (iterator.hasNext()) {
            int bookId = iterator.next().getId();
            if(bookId == bookToEdit.getId()){
                iterator.remove();
            }
        }
        Library.getInstance().getBooksList().add(bookToEdit);
        System.out.println("Changes saved");
        System.out.println();
    }
}
