package com.javafordev.lesson7.task1;

public class MovieRunner {
    public static void main(String[] args) {

        Movie movie = new Movie("Город грехов");
        System.out.println("Инфо о фильме \"" + movie.getMovieName() + "\" ...");
        System.out.println(movie);
    }
}
