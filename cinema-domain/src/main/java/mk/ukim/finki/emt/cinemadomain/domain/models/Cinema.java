package mk.ukim.finki.emt.cinemadomain.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.base.location.Location;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="cinemas")
@Getter
public class Cinema extends AbstractEntity<CinemaId> {
    private String name;
    private Location location;

    protected Cinema() {
        super(CinemaId.randomId(CinemaId.class));
    }

    public Cinema(String name, Location location) {
        super(CinemaId.randomId(CinemaId.class));
        this.name = name;
        this.location = location;
    }
    public static Cinema build(String name, Location location) {
        return new Cinema(name, location);
    }


}
