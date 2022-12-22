package curs02.oo.challenge2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Award oscar1990 = new Award("oscar", 1990);
        Award oscar2000 = new Award("oscar", 2000);
        Award oscar2010 = new Award("oscar", 2010);
        Award oscar2018 = new Award("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor with 2 oscars", 35, new Award[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("actor with oscar form 2010", 55, new Award[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor with oscar form 2018", 23, new Award[]{oscar2018});
        Actor actorWithoutAwards01 = new Actor("actor without oscar 01", 33, new Award[]{});
        Actor actorWithoutAwards02 = new Actor("actor without oscar 02", 60, new Award[]{});
        Actor actorWithoutAwards03 = new Actor("actor without oscar 03", 20, new Award[]{});

        Movie movie1 = new Movie(
                1990,
                "movie with actors with oscar",
                new Actor[]{actorOscar1990, actorWithoutAwards01}
        );
        Movie movie2 = new Movie(
                1990,
                "movie with actors without awards 2",
                new Actor[]{actorWithoutAwards01, actorWithoutAwards02, actorWithoutAwards03}
        );
        Movie movie3 = new Movie(
                1990,
                "movie with actors without awards 3",
                new Actor[]{actorWithoutAwards01, actorWithoutAwards02, actorWithoutAwards03}
        );
        Movie movie4 = new Movie(
                1990,
                "movie with actors with oscar",
                new Actor[]{actorOscar2010, actorOscar2018, actorWithoutAwards02}
        );
        Movie movie5 = new Movie(
                1990,
                "movie with actors without awards 5",
                new Actor[]{actorWithoutAwards02, actorWithoutAwards03}
        );

        Studio studio1 = new Studio("MGM", new Movie[]{movie1, movie2});
        Studio studio2 = new Studio("Disney", new Movie[]{movie3, movie4, movie5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        System.out.println("Get all studio names that have published more than 2 movies:");
        System.out.println(getAllStudioNamesThatHaveMoreXMovies(studioDatabase, 2));
        System.out.println("Get all studio names in witch plays actor with name \"actor with 2 oscars\":");
        System.out.println(getAllStudioInWitchPlaysActorWithXName(studioDatabase, "actor with 2 oscars"));
        System.out.println("Get all studio names in witch plays at least an actor with age above 50: ");
        System.out.println(getAllMoviesWithActorOlderThan(studioDatabase, 50));

    }

    public static List<String> getAllStudioNamesThatHaveMoreXMovies(Studio[] studios, int x){
        return Arrays.stream(studios)
                .filter(studio -> studio.getNumberOfMovies() > x)
                .map(Studio::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getAllStudioInWitchPlaysActorWithXName(Studio[] studios, String x){
        return Arrays.stream(studios)
                .filter(studio -> studio.haveActor(x))
                .map(Studio::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getAllMoviesWithActorOlderThan(Studio[] studios, int age){
        return Arrays.stream(studios)
                .map(Studio::getMovies)
                .flatMap(Collection::stream)
                .filter(movie -> movie.haveActorOlderThan(age))
                .map(Movie::getName)
                .collect(Collectors.toList());
    }
}
