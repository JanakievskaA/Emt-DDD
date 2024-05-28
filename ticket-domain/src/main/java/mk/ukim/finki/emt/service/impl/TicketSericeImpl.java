package mk.ukim.finki.emt.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.domain.model.Client;
import mk.ukim.finki.emt.domain.model.Ticket;
import mk.ukim.finki.emt.domain.model.TicketId;
import mk.ukim.finki.emt.domain.repository.TicketRepository;
import mk.ukim.finki.emt.service.TicketService;
import mk.ukim.finki.emt.service.forms.TicketForm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class TicketSericeImpl implements TicketService {
    private final TicketRepository ticketRepository;
    @Override
    public TicketId placeTicket(TicketForm ticketForm) {
        Objects.requireNonNull(ticketForm,"ticket must not be null");
        var newTicket=ticketRepository.saveAndFlush(toDomainObject(ticketForm));
        return newTicket.getId();
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public Optional<Ticket> findById(TicketId id) {
        return ticketRepository.findById(id);
    }
    private Ticket toDomainObject(TicketForm ticketForm) {
        var client=new Client(ticketForm.getClientForm().getEmbg(),ticketForm.getClientForm().getEmail(),ticketForm.getClientForm().getPol(),ticketForm.getClientForm().getSurname(),ticketForm.getClientForm().getName());
        var ticket=new Ticket(ticketForm.getTip(),ticketForm.getMoney(),client);
        return ticket;


    }
}
