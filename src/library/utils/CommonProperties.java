package library.utils;

import library.entity_classes.Genre;
import library.enums.GenreName;


import java.util.Iterator;
import java.util.Map;

public class CommonProperties {

    public static final int NUMBER_OF_GENRES = new Genre(0).getGenresList().size()-1;
    public static final int LIBRARY_CAPACITY = 99;
    public static String GENRES_REPRESENTATION = getGenresRepresentation();


    private static String getGenresRepresentation (){
        String result = "";
        Iterator iterator = new Genre(0).getGenresList().entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Iterator, GenreName> pair = ( Map.Entry<Iterator, GenreName>) iterator.next();
            result += pair.getKey() + "-" + pair.getValue() + ", ";

        }
            return "\"" + result.substring(0, result.length()-2) + "\"";
    }
}
