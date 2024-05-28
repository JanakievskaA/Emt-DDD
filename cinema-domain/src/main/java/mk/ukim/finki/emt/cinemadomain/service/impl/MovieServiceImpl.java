package mk.ukim.finki.emt.cinemadomain.service.impl;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.cinemadomain.domain.repo.MovieRepository;
import mk.ukim.finki.emt.cinemadomain.domain.models.Movie;
import mk.ukim.finki.emt.cinemadomain.domain.models.MovieId;
import mk.ukim.finki.emt.cinemadomain.service.Movieservice;
import mk.ukim.finki.emt.cinemadomain.service.form.MovieForm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class MovieServiceImpl implements Movieservice {
    private final MovieRepository repository;
    @Override
    public Optional<Movie> findById(MovieId id) {
        return repository.findById(id);
    }
@Override
    public MovieId createMovie(MovieForm movieForm) {
        Objects.requireNonNull(movieForm,"movie must not be null.");

        var newMovie = repository.saveAndFlush(toDomainObject(movieForm));
        return newMovie.getId();
    }
    private Movie toDomainObject(MovieForm movieForm) {
        var movie = new Movie(movieForm.getGenre(),movieForm.getTitle(),movieForm.getDirector(),movieForm.getDuration(),movieForm.getCinema(),movieForm.getHall());
        return movie;
    }



    @Override
    public List<Movie> getAll() {
        return repository.findAll();
    }
}
