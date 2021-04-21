package library.entity_classes;

import library.utils.CommonProperties;

import java.util.ArrayList;;
import java.util.Random;

public class Book implements Comparable{

    private int id;
    private String title;
    private Genre genre;
    private long timeCreated;

    public Book(String title, Genre genre) {
        generateUniqueId();
        this.title = title;
        this.genre = genre;
        this.timeCreated = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public long getTimeCreated() {
        return timeCreated;
    }

    private void generateUniqueId(){
        ArrayList<Integer> bookIds = new ArrayList<>();

        for (Book book : Library.getInstance().getBooksList()) {
            bookIds.add(book.getId());
        }
        while (true){
            int randomNumber = new Random().nextInt(CommonProperties.LIBRARY_CAPACITY)+1;
            if (!bookIds.contains(randomNumber)) {
                this.id = randomNumber;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Title: '" + title + "', Genre: " + genre.getGenreId() + ']';
    }

    @Override
    public int compareTo(Object o) {
        return title.compareTo(this.title);
    }
}
