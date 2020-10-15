package com.javafordev.lesson7.task1;

import java.util.Arrays;

/**
 * Создать класс Фильм с внутренним классом,
 * с помощью объектов которого можно хранить инфо
 * - продолжительности
 * - жанре
 * - режиссерах фильма
 */

public class Movie {

    private String movieName;
    private MovieInfo movieInfo;

    public Movie(String name) {
        this.movieName = name;
        this.movieInfo = new MovieInfo(2, "триллер", new String[]{"Роберт Родригес", "Фрэнк Миллер", "Квентин Тарантино"});
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieInfo=" + movieInfo +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public MovieInfo getMovieInfo() {
        return movieInfo;
    }

    public void setMovieInfo(MovieInfo movieInfo) {
        this.movieInfo = movieInfo;
    }

    private class MovieInfo {

        private int movieDuration;
        private String movieGenre;
        private String[] movieDirectors;

        public MovieInfo(int movieDuration, String movieGenre, String[] movieDirectors) {
            this.movieDuration = movieDuration;
            this.movieGenre = movieGenre;
            this.movieDirectors = movieDirectors;
        }

        @Override
        public String toString() {
            return "MovieInfo{" +
                    "movieDuration=" + movieDuration +
                    ", movieGenre='" + movieGenre + '\'' +
                    ", movieDirectors=" + Arrays.toString(movieDirectors) +
                    '}';
        }

    }

}
