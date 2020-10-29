package com.javafordev.lesson7.task1;

import java.util.List;

public class MovieRunner {
    public static void main(String[] args) {

        List<String> directors = List.of("Роберт Родригес", "Фрэнк Миллер", "Квентин Тарантино");
        Movie movie = new Movie("Город грехов", new Movie.MovieInfo(2, "триллер", directors));
        System.out.println("Инфо о фильме \"" + movie.getName() + "\" ...");
        System.out.println(movie);
    }
}
