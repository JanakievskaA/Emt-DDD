package mk.ukim.finki.emt.cinemadomain.domain.repo;

import mk.ukim.finki.emt.cinemadomain.domain.models.Hall;
import mk.ukim.finki.emt.cinemadomain.domain.models.HallId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallRepository extends JpaRepository<Hall, HallId> {
}
