package mk.ukim.finki.emt.domain.valueobjects;

import jakarta.persistence.Embeddable;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

@Embeddable
public class MovieId extends DomainObjectId {
    protected MovieId() {
        super(MovieId.randomId(MovieId.class).getId());
    }

    public MovieId(String uuid) {
        super(uuid);
    }

}
