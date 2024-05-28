package mk.ukim.finki.emt.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.base.financial.Money;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="tickets")
@Getter
public class Ticket extends AbstractEntity<TicketId> {
    @Enumerated(EnumType.STRING)
    private Tip tip;
    private Money money;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id",referencedColumnName = "id")
    private Client client;


    protected Ticket() {
        super(TicketId.randomId(TicketId.class));
    }

    public Ticket(Tip tip,Money money,Client client) {
        super(TicketId.randomId(TicketId.class));
        this.tip = tip;
        this.money = money;
        this.client=client;
    }





}
