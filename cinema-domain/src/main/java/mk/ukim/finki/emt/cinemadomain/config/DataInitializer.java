package mk.ukim.finki.emt.cinemadomain.config;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import mk.ukim.finki.emt.cinemadomain.domain.models.Cinema;
import mk.ukim.finki.emt.cinemadomain.domain.models.Hall;
import mk.ukim.finki.emt.cinemadomain.domain.models.Movie;
import mk.ukim.finki.emt.cinemadomain.domain.repo.CinemaRepository;
import mk.ukim.finki.emt.cinemadomain.domain.repo.HallRepository;
import mk.ukim.finki.emt.cinemadomain.domain.repo.MovieRepository;

import mk.ukim.finki.emt.sharedkernel.domain.base.location.Location;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final CinemaRepository cinemaRepository;
    private final HallRepository hallRepository;
    private final MovieRepository movieRepository;

    @PostConstruct
    public void initData() {
        // Create Location
        Location location1 = new Location("Address 1", "City 1");
        Location location2 = new Location("Address 2", "City 2");
        // Create Cinemas
        Cinema cinema1 = Cinema.build("Cinema 1", location1);
        Cinema cinema2 = Cinema.build("Cinema 2", location2);

        cinemaRepository.saveAll(List.of(cinema1, cinema2));

        // Create Halls
        Hall hall1 = new Hall(1, 100);
        Hall hall2 = new Hall(2, 150);

        hallRepository.saveAll(List.of(hall1, hall2));

        // Create Movies
        Movie movie1 = new Movie("Action", "Movie 1", "Director 1", Duration.ofMinutes(120), cinema1, hall1);
        Movie movie2 = new Movie("Drama", "Movie 2", "Director 2", Duration.ofMinutes(90), cinema2, hall2);

        movieRepository.saveAll(List.of(movie1, movie2));
    }
}
