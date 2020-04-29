package cn.xpbootcamp.refactor;

import java.util.Dictionary;
import java.util.Hashtable;

public class MovieLibrary {
    private static Dictionary<Integer,Movie> rentals = new Hashtable<>();

    static public void addMovie(Movie movie){
        rentals.put(movie.getId(),movie);
    }

    static public  Movie getMoveById(int movieId){
        return rentals.get(movieId);
    }

}
