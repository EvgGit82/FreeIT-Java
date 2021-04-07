package library.entity_classes;

import library.enums.GenreName;
import library.utils.CommonProperties;

import java.util.*;

public class Genre {

    private int genreId;

    private  Map<Integer, GenreName> genresList = new HashMap<>(){{
        put(0, GenreName.NO_GENRE);
        put(1, GenreName.ADVENTURE);
        put(2, GenreName.BIOGRAPHY);
        put(3, GenreName.FANTASY);
        put(4, GenreName.HISTORICAL_FICTION);
        put(5, GenreName.HORROR);
        put(6, GenreName.MYSTERY);
        put(7, GenreName.RELIGION);
        put(8, GenreName.ROMANCE);
        put(9, GenreName.SCIENCE_FICTION);
        put(10, GenreName.THRILLER);
    }};

    public Genre(int genreId) {
        if (genreId > CommonProperties.NUMBER_OF_GENRES) {
            this.genreId = 0;
        } else {
            this.genreId = genreId;
        }
    }

    public Map<Integer, GenreName> getGenresList() {
        return genresList;
    }

    public GenreName getGenreId() {
        return genresList.get(genreId);
    }

    public void setGenreId(int genreId) {
        if (genreId > CommonProperties.NUMBER_OF_GENRES) {
            System.out.println("Operation unavailable - value out of range! Default value will be applied");
            this.genreId = 0;
        } else {
            this.genreId = genreId;
        }
    }
}
