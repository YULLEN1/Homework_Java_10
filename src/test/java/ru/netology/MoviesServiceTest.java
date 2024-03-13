
package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesServiceTest {

    @Test
    public void shouldFindAll() {

        MoviesService moviesService = new MoviesService();
        String movie1 = "Гарри Поттер 1";
        String movie2 = "Гарри Поттер 2";
        String movie3 = "Гарри Поттер 3";

        moviesService.add(movie1);
        moviesService.add(movie2);
        moviesService.add(movie3);

        String[] actual = moviesService.findAll();
        String[] expected = {movie1, movie2, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLessLimit() {

        MoviesService moviesService = new MoviesService();
        String movie1 = "Гарри Поттер 1";
        String movie2 = "Гарри Поттер 2";
        String movie3 = "Гарри Поттер 3";

        moviesService.add(movie1);
        moviesService.add(movie2);
        moviesService.add(movie3);

        String[] actual = moviesService.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindALastMoreLimit() {

        MoviesService moviesService = new MoviesService(6);
        String movie1 = "Гарри Поттер 1";
        String movie2 = "Гарри Поттер 2";
        String movie3 = "Гарри Поттер 3";
        String movie4 = "Гарри Поттер 4";
        String movie5 = "Гарри Поттер 5";
        String movie6 = "Гарри Поттер 6";
        String movie7 = "Гарри Поттер 7";


        moviesService.add(movie1);
        moviesService.add(movie2);
        moviesService.add(movie3);
        moviesService.add(movie4);
        moviesService.add(movie5);
        moviesService.add(movie6);
        moviesService.add(movie7);


        String[] actual = moviesService.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2};
        Assertions.assertArrayEquals(expected, actual);
    }
}
