package library.db_commands;

import library.entity_classes.Book;
import library.entity_classes.Library;

import java.util.ArrayList;

public class AddBook {

    private Book book;

    public AddBook(Book book) {
        this.book = book;
    }

    public void execute (){
        ArrayList<Integer> bookIDs = new ArrayList<>();
        for (Book aBook : Library.getInstance().getBooksList()) {
            bookIDs.add(aBook.getId());
        }

        if (bookIDs.contains(book.getId())){
            System.out.println("Cannot add this book - the library already has a book with this id!");
        } else {
            Library.getInstance().getBooksList().add(book);
            System.out.println("Book added");
        }
    }
}
