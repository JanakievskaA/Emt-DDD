package mk.ukim.finki.emt.cinemadomain.domain.repo;

import mk.ukim.finki.emt.cinemadomain.domain.models.Movie;
import mk.ukim.finki.emt.cinemadomain.domain.models.MovieId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, MovieId> {
}
