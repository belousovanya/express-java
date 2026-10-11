package homework_12.movie_service;

import java.util.*;

public class MovieService {
    private Map<Movie, List<Rating<?>>> ratings = new HashMap<>();

    public synchronized void addRating(Movie movie, Rating<?> rating) {
        double value = rating.getRating().doubleValue();

        if (value < 1 || value > 10) {
            throw new InvalidRatingException("Некорректный рейтинг");
        }
        ratings.computeIfAbsent(movie, key -> new ArrayList<>())
                .add(rating);
    }

    public synchronized double calculateAverage(Movie movie) {
        return ratings.getOrDefault(movie, List.of()).stream()
                .mapToDouble(rating -> rating.getRating().doubleValue())
                .average()
                .orElse(0.0);
    }

    public synchronized List<Movie> sortMoviesByAverageRating() {
        return ratings.keySet().stream()
                .sorted(Comparator.comparingDouble(
                        (Movie movie) -> calculateAverage(movie)
                ).reversed())
                .toList();
    }
}