package homework_12.movie_service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
    /**
     * Добавление оценки: корректная оценка сохраняется, границы рейтинга: 1 и 10 принимаются.
     * Некорректный рейтинг: 0, 11, 0.5 и 10.5 вызывают InvalidRatingException.
     * Типы оценок: Integer и Double принимаются. Среднее: оценки 8 и 9.5 дают 8.75.
     * Разные фильмы: оценки одного фильма не влияют на среднее другого.
     * Фильм без оценок: среднее равно 0.0.
     * Сортировка: фильмы расположены от большего среднего рейтинга к меньшему.
     * Одинаковые фильмы используют общий список оценок
     */

    private MovieService movieService;

    @BeforeEach
    public void setupTest() {
        movieService = new MovieService();
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 5, 10})
    public void userCanAddValidRating(int rating) {
        Movie movie = new Movie("Интерстеллар", "Кристофер Нолан");
        Rating<Integer> ratingForAdding = new Rating<>(rating);

        movieService.addRating(movie, ratingForAdding);

        double expectedResult = rating;
        double actualResult = movieService.calculateAverage(movie);

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.0, 11.0, 0.5, 10.5})
    public void userCanNotAddRating(double rating) {
        Movie movie = new Movie("Интерстеллар", "Кристофер Нолан");
        Rating<Double> ratingForAdding = new Rating<>(rating);

        assertThrows(InvalidRatingException.class,
                () -> movieService.addRating(movie, ratingForAdding)
        );
    }

    @Test
    public void userCanCalculateAverageWithDifferentRatingTypes() {
        Movie movie = new Movie("Интерстеллар", "Кристофер Нолан");

        Rating<Integer> integerRating = new Rating<>(8);
        Rating<Double> doubleRating = new Rating<>(9.5);

        movieService.addRating(movie, integerRating);
        movieService.addRating(movie, doubleRating);

        double expectedResult = 8.75;
        double actualResult = movieService.calculateAverage(movie);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanCalculateAverageWithDifferentMovies() {
        Movie movie1 = new Movie("Интерстеллар", "Кристофер Нолан");
        Movie movie2 = new Movie("Малхолланд драйв", "Дэвид Линч");

        Rating<Integer> integerRating1 = new Rating<>(8);
        Rating<Integer> integerRating2 = new Rating<>(9);
        Rating<Integer> integerRating3 = new Rating<>(7);
        Rating<Integer> integerRating4 = new Rating<>(6);

        movieService.addRating(movie1, integerRating1);
        movieService.addRating(movie1, integerRating2);
        movieService.addRating(movie2, integerRating3);
        movieService.addRating(movie2, integerRating4);

        double expectedAverage1 = 8.5;
        double expectedAverage2 = 6.5;

        double actualAverage1 = movieService.calculateAverage(movie1);
        double actualAverage2 = movieService.calculateAverage(movie2);

        assertEquals(expectedAverage1, actualAverage1);
        assertEquals(expectedAverage2, actualAverage2);
    }

    @Test
    public void userCanSeeThatMovieWithoutRatingsHasZeroAverage() {
        Movie movie = new Movie("Малхолланд драйв", "Дэвид Линч");

        double expectedAverage = 0.0;
        double actualAverage = movieService.calculateAverage(movie);

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void userCanSortMoviesByRating() {
        Movie movie1 = new Movie("Интерстеллар", "Кристофер Нолан");
        Movie movie2 = new Movie("Малхолланд драйв", "Дэвид Линч");

        Rating<Integer> integerRating1 = new Rating<>(8);
        Rating<Integer> integerRating2 = new Rating<>(9);
        Rating<Integer> integerRating3 = new Rating<>(7);
        Rating<Integer> integerRating4 = new Rating<>(6);

        movieService.addRating(movie1, integerRating1);
        movieService.addRating(movie1, integerRating2);
        movieService.addRating(movie2, integerRating3);
        movieService.addRating(movie2, integerRating4);

        List<Movie> expectedResult = List.of(movie1, movie2);
        List<Movie> actualResult = movieService.sortMoviesByAverageRating();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanSeeThatEqualMoviesHaveSharedRatings() {
        Movie movie1 = new Movie("Интерстеллар", "Кристофер Нолан");
        Movie movie2 = new Movie("Интерстеллар", "Кристофер Нолан");

        Rating<Integer> integerRating1 = new Rating<>(8);
        Rating<Integer> integerRating2 = new Rating<>(10);

        movieService.addRating(movie1, integerRating1);
        movieService.addRating(movie1, integerRating2);

        double expectedAverage = 9.0;
        double actualAverage1 = movieService.calculateAverage(movie1);
        double actualAverage2 = movieService.calculateAverage(movie2);

        int expectedCount = 1;
        int actualCount = movieService.sortMoviesByAverageRating().size();

        assertEquals(expectedAverage, actualAverage1);
        assertEquals(expectedAverage, actualAverage2);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void userCanSureThatConcurrentRatingsAreNotLost() throws InterruptedException, ExecutionException {
        Movie movie = new Movie("Малхолланд драйв", "Дэвид Линч");
        Rating<Integer> integerRating = new Rating<>(10);

        movieService.addRating(movie, integerRating);

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        try {
            List<Callable<Void>> tasks = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                tasks.add(() -> {
                    movieService.addRating(movie, new Rating<>(1));
                    return null;
                });
            }

            List<Future<Void>> futureList = executorService.invokeAll(tasks);

            for (Future<Void> result : futureList) {
                result.get();
            }

            double expectedAverage = 110.0 / 101;
            double actualAverage = movieService.calculateAverage(movie);

            assertEquals(expectedAverage, actualAverage, 0.000001);
        } finally {
            executorService.shutdown();
        }
    }
}
