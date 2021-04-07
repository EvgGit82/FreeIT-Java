package library.sorters;

import library.entity_classes.Book;
import library.entity_classes.Library;

import java.util.Collections;
import java.util.Comparator;

public class ListSorter {

    public void sortLibraryList(int option){

        switch (option){
            case 1:
                Collections.sort(Library.getInstance().getBooksList(), Comparator.comparing(Book::getTitle));
                break;
            case 2:
                Collections.sort(Library.getInstance().getBooksList(), new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o2.getTitle().compareTo(o1.getTitle());
                    }
                });
                break;
            case 3:
                Collections.sort(Library.getInstance().getBooksList(), Comparator.comparingInt(o -> (int) o.getTimeCreated()));
                Collections.reverse(Library.getInstance().getBooksList());
        }
    }
}
