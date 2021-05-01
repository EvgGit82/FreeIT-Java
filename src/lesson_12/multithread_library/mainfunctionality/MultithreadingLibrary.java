package lesson_12.multithread_library.mainfunctionality;

import lesson_12.multithread_library.Properties;
import lesson_12.multithread_library.lists.Containers;
import lesson_12.multithread_library.lists.CustomerNames;
import lesson_12.multithread_library.lists.CustomerReplies;
import lesson_12.multithread_library.lists.OkayPhrases;
import lesson_12.multithread_library.models.Book;
import lesson_12.multithread_library.xmlprocessors.BooksDOMParser;
import lesson_12.multithread_library.xmlprocessors.XMLValidator;

import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;


public class MultithreadingLibrary {

    public static final String VALIDATION_SCHEME_PATH = "src/lesson_12/multithread_library/xmls/booksValidationScheme.xsd";
    public static final String XML_PATH = "src/lesson_12/multithread_library/xmls/books.xml";
    private static final File xmlFile = new File(XML_PATH);
    private static volatile List<Book> libraryBooksList;


    public void start () {

        System.out.println();

        XMLValidator.validateXML(XML_PATH, VALIDATION_SCHEME_PATH);

        libraryBooksList = BooksDOMParser.getObjectsFromXML(xmlFile);

        System.out.println(libraryBooksList.size() != 0 ? "Books list loaded." : "Books list failed to load.");

        System.out.println("\n");

        System.out.println("There are " + libraryBooksList.size() + " books in the library now.");

        System.out.println("\n");

        System.out.println("The library opens in the morning.");
        System.out.println("First readers will soon arrive.");

        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Library library = new Library(libraryBooksList);

        ExecutorService customers = Executors.newFixedThreadPool(Properties.NUMBER_OF_CUSTOMERS);

        for (int customer = 0; customer < Properties.NUMBER_OF_CUSTOMERS; customer++) {
            customers.submit(() -> {
                try {
                    String customerName = getCustomerName();
                    library.customerServicing(customerName);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        customers.shutdown();

        try {
            customers.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        System.out.println("Library closes for today. " + libraryBooksList.size()
                + " books left in the library. Others have been taken home.");
    }

    private String getCustomerName() {
        String customerName = CustomerNames.namesList.get(new Random().nextInt(CustomerNames.namesList.size()-1));
        CustomerNames.namesList.remove(customerName);
        return customerName;
    }
}

class Library {

    private List<Book> libraryBooksList;
    private Semaphore librarians = new Semaphore(Properties.NUMBER_OF_LIBRARIANS);


    public Library(List<Book> libraryBooksList) {
        this.libraryBooksList = libraryBooksList;
    }

    public void customerServicing (String customerName) throws InterruptedException {
        librarians.acquire();
        try{
            customerActions(customerName);
        } finally {
            librarians.release();
        }
    }

    public void customerActions (String customerName) {
        System.out.println(customerName + " walks into the Library");

        int numberOfBooksToGet = new Random().nextInt(3) + 1;

        for (int i = 0; i < numberOfBooksToGet; i++) {
            getBookFromLibrarian(customerName);
        }

        System.out.println(customerName + " leaves the library");
    }

    private void getBookFromLibrarian(String customerName) {

        Book book = getBookFromLibraryList();

        synchronized (this) {
            System.out.println(customerName + " comes up to a librarian and says: \"I want to read a(an) "
                    + book.getGenre().toString().toLowerCase() + " book.\" "
                    + "It would be nice to read '" + book.getTitle() + "' by " + book.getAuthor() + "\"");

            System.out.println("\"" + OkayPhrases.okaysList.get(new Random()
                    .nextInt(OkayPhrases.okaysList.size()-1))
                    + "\", says the librarian to " + customerName + ". \"We do have this book. "
                    + ((book.isHardCover()) ? "It is in hard cover, so you may take it home\"."
                    : "It is in soft cover, so you may only read it in our reading room\"."));

            System.out.println("\"" + CustomerReplies.answers.get(new Random()
                    .nextInt(CustomerReplies.answers.size()-1)) + "\", says " + customerName + ".");
        }

        if (book.isHardCover()) {
            System.out.println(customerName + " puts the book in the "
                    + Containers.containers.get(new Random().nextInt(Containers.containers.size())-1) + ".");
            return;
        } else {

            System.out.println(customerName + " takes the book and enters the reading room.");

            try {
                Thread.sleep(new Random().nextInt(20000) + 5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(customerName + " reads '" + book.getTitle()
                    + "' the book for some time then returns the book to the librarian");
            libraryBooksList.add(book);
        }
    }

    private Book getBookFromLibraryList() {
        Book book = libraryBooksList.get(new Random().nextInt(libraryBooksList.size()-1));
        libraryBooksList.remove(book);
        return book;
    }
}