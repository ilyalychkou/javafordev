package com.javafordev.lesson7.task1;

import java.util.List;

/**
 * Создать класс Фильм с внутренним классом,
 * с помощью объектов которого можно хранить инфо
 * - продолжительности
 * - жанре
 * - режиссерах фильма
 */

public class Movie {

    private String name;
    private MovieInfo movieInfo;

    public Movie(String name, MovieInfo movieInfo) {
        this.name = name;
        this.movieInfo = movieInfo;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + name + '\'' +
                ", movieInfo=" + movieInfo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieInfo getMovieInfo() {
        return movieInfo;
    }

    public void setMovieInfo(MovieInfo movieInfo) {
        this.movieInfo = movieInfo;
    }

    public static class MovieInfo {

        private int movieDuration;
        private String movieGenre;
        private List<String> movieDirectors;

        public MovieInfo(int movieDuration, String movieGenre, List<String> movieDirectors) {
            this.movieDuration = movieDuration;
            this.movieGenre = movieGenre;
            this.movieDirectors = movieDirectors;
        }

        public void setMovieDuration(int movieDuration) {
            this.movieDuration = movieDuration;
        }

        public void setMovieGenre(String movieGenre) {
            this.movieGenre = movieGenre;
        }

        public void setMovieDirectors(List<String> movieDirectors) {
            this.movieDirectors = movieDirectors;
        }

        @Override
        public String toString() {
            return "MovieInfo{" +
                    "movieDuration=" + movieDuration +
                    ", movieGenre='" + movieGenre + '\'' +
                    ", movieDirectors=" + movieDirectors +
                    '}';
        }

    }

}
