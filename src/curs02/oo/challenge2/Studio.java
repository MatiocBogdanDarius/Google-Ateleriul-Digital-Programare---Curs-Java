package curs02.oo.challenge2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Studio {
    private String name;
    private Movie[] movies;

    public Studio(String name, Movie[] movies) {
        this.name = name;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
        return List.of(movies);
    }

    public int getNumberOfMovies() {
        return movies.length;
    }

    public boolean haveActor(String name) {
        return Arrays.stream(movies)
                .map(Movie::getActors)
                .flatMap(Collection::stream)
                .anyMatch(actor -> actor.getName().equals(name));
    }
}
