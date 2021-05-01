package lesson_12.multithread_library.models;

public class Book {

    private String title;
    private String author;
    private GenreName genre;
    private int year;
    private boolean isHardCover;

    public Book() {
    }

    public Book(String title, String author, GenreName genre, int year, boolean isHardCover) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.isHardCover = isHardCover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public GenreName getGenre() {
        return genre;
    }

    public void setGenre(GenreName genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    @Override
    public String toString() {
        return "Book [" +
                "title: '" + title + "', author: " + author + ", genre: " + genre + ", year: "
                + year + ", " + ((isHardCover) ? "hard cover" : "soft cover") + ']';

    }
}
