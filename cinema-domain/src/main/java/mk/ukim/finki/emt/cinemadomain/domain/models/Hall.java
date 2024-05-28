package mk.ukim.finki.emt.cinemadomain.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

@Entity
@Table(name="halls")
@Getter
public class Hall extends AbstractEntity<HallId> {

    private int number;
    private int capacity;

    protected Hall() {
        super(HallId.randomId(HallId.class));
    }
    public Hall(int number,int capacity) {
        super(DomainObjectId.randomId(HallId.class));
        this.number = number;
        this.capacity = capacity;

    }

}
