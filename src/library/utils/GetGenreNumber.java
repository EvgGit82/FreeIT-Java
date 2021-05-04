package library.utils;

public class GetGenreNumber {

    public int execute () {
        int genre;
        do {
            System.out.println("Enter Genre using number (" + CommonProperties.GENRES_REPRESENTATION + "):");
            genre = new GetNumberFromScanner().execute();
        } while (genre < 0 || genre > CommonProperties.NUMBER_OF_GENRES);

        return genre;
    }
}
