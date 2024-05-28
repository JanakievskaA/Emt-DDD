package mk.ukim.finki.emt.cinemadomain.service;

import mk.ukim.finki.emt.cinemadomain.domain.models.Movie;
import mk.ukim.finki.emt.cinemadomain.domain.models.MovieId;
import mk.ukim.finki.emt.cinemadomain.service.form.MovieForm;
import java.util.List;
import java.util.Optional;

public interface Movieservice {
    Optional<Movie> findById(MovieId id);
    MovieId createMovie(MovieForm form);

    List<Movie> getAll();

}

