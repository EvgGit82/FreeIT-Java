package library.testdata;

import library.db_commands.AddBook;
import library.entity_classes.Book;
import library.entity_classes.Genre;

public class LoadTestData {

    public void execute () throws InterruptedException {

        System.out.println("Adding test books...");
        Thread.sleep(1000);

        new AddBook(new Book("Gone with the Wind", new Genre(8))).execute();
        new AddBook(new Book ("Treasure Island", new Genre(1))).execute();
        new AddBook(new Book("Lord of the Rings", new Genre(3))).execute();
        new AddBook(new Book("Jurassic Park", new Genre(9))).execute();
        new AddBook(new Book("Pet Sematary", new Genre(5))).execute();
        new AddBook(new Book("Holy Bible", new Genre(7))).execute();
        new AddBook(new Book("Shining", new Genre(20))).execute();

        System.out.println();

        System.out.println("Application ready.");
        System.out.println();
    }
}
