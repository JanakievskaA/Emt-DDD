package mk.ukim.finki.emt.cinemadomain.domain.models;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class CinemaId extends DomainObjectId {
    private CinemaId() {
        super(CinemaId.randomId(CinemaId.class).getId());
    }

    public CinemaId(@NonNull String uuid) {
        super(uuid);
    }

}
