package mk.ukim.finki.emt.sharedkernel.domain.base.location;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Embeddable
public class Location implements ValueObject {
    @Column(name = "city")
    private final String city;

    @Column(name = "country")
    private final String country;

    protected Location() {
        this.city = null;
        this.country = null;
    }

    public Location(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
