package library.entity_classes;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> booksList = new ArrayList<>();

    private Library(){}

    private static Library instance;

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public List<Book> getBooksList() {
        return booksList;
    }
}
