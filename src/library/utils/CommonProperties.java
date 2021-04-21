package library.utils;

import library.entity_classes.Genre;
import library.enums.GenreName;

import java.util.Map;

public class CommonProperties {

    public static final int NUMBER_OF_GENRES = new Genre(0).getGenresList().size()-1;
    public static final int LIBRARY_CAPACITY = 99;
    public static String GENRES_REPRESENTATION = getGenresRepresentation();


    private static String getGenresRepresentation (){
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, GenreName> pair : new Genre(0).getGenresList().entrySet()) {
            result.append(pair.getKey()).append("-").append(pair.getValue()).append(", ");

        }
            return result.substring(0, result.length()-2).replace("_", " ");
    }
}
