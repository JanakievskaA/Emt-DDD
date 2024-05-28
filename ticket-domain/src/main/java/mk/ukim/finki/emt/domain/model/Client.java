package mk.ukim.finki.emt.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

@Entity
@Table(name="clients")
@Getter
public class Client extends AbstractEntity<ClientId> {
    private String embg;
    private String email;
    private String pol;
    private String surname;
    private String name;

    protected Client() {
        super(DomainObjectId.randomId(ClientId.class));
    }
    public Client(String embg,String email,String pol,String surname,String name) {
        super(DomainObjectId.randomId(ClientId.class));
        this.embg = embg;
        this.email = email;
        this.pol = pol;
        this.surname = surname;
        this.name = name;
    }

    }


