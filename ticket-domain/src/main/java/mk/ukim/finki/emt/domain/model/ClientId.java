package mk.ukim.finki.emt.domain.model;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class ClientId extends DomainObjectId {
    private ClientId() {
        super(ClientId.randomId(ClientId.class).getId());
    }

    public ClientId(String uuid) {
        super(uuid);
    }

}
