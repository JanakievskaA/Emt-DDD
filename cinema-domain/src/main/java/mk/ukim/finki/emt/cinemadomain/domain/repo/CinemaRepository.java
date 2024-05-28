package mk.ukim.finki.emt.cinemadomain.domain.repo;

import mk.ukim.finki.emt.cinemadomain.domain.models.Cinema;
import mk.ukim.finki.emt.cinemadomain.domain.models.CinemaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, CinemaId> {
}
