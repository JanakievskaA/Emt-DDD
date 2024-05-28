package mk.ukim.finki.emt.service;
import mk.ukim.finki.emt.domain.model.Ticket;
import mk.ukim.finki.emt.domain.model.TicketId;
import mk.ukim.finki.emt.service.forms.TicketForm;

import java.util.List;
import java.util.Optional;

public interface TicketService {
    TicketId placeTicket(TicketForm ticketForm);

    List<Ticket> findAll();

    Optional<Ticket> findById(TicketId id);


}
