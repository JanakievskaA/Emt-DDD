package mk.ukim.finki.emt.domain.repository;

import mk.ukim.finki.emt.domain.model.Ticket;
import mk.ukim.finki.emt.domain.model.TicketId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, TicketId> {
}
