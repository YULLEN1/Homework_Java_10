package ru.netology;

public class MoviesService {
    private String[] movies = new String[0];
    private int limit;

    public MoviesService() {
        this.limit = 5;
    }

    public MoviesService(int limit) {
        this.limit = limit;
    }

    public void add(String newMovie) {

        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (limit < movies.length) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = result[movies.length - 1 - i];

        }
        return result;
    }
}
