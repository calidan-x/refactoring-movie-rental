package cn.xpbootcamp.refactor;

public class Movie {

    private int id;
    private String title;
    private MovieType movieType;

    Movie(int id,String title, MovieType movieType) {
        this.id = id;
        this.title = title;
        this.movieType = movieType;
    }


    int getId(){
        return id;
    }

    MovieType getMovieType() {
        return movieType;
    }

    String getTitle() {
        return title;
    }

}
