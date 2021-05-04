package library.db_commands;

import library.entity_classes.Book;
import library.entity_classes.Library;

public class PrintBookList {

    public void execute(){
        for (Book book : Library.getInstance().getBooksList()) {
            System.out.println(book);
        }
        System.out.println();
    }
}
