package library.utils;

public class GetGenreNumber {

    public int execute () {
        int genre;
        do {
            System.out.println("Enter Genre using number (1-Adventure, 2-Biography, 3-Fantasy, 4-Historical fiction, " +
                    "5-Horror, 6-Mystery, 7-Religion, 8-Romance, 9-Science fiction, 10-Thriller, 0-No genre specified):");
            genre = new GetNumberFromScanner().execute();
        } while (genre < 0 || genre > CommonProperties.NUMBER_OF_GENRES);

        return genre;
    }
}
