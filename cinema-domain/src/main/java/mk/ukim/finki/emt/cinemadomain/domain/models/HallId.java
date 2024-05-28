package mk.ukim.finki.emt.cinemadomain.domain.models;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class HallId extends DomainObjectId {
    private HallId() {
        super(HallId.randomId(HallId.class).getId());
    }

    public HallId(@NonNull String uuid) {
        super(uuid);
    }

}

