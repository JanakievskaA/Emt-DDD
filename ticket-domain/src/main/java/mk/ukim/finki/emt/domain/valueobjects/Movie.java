package mk.ukim.finki.emt.domain.valueobjects;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

import java.time.Duration;

@Getter
public class Movie implements ValueObject {
    private final MovieId id;
    private String genre;
    private String title;
    private String director;
    private Duration duration;

    private Movie() {
        this.id=MovieId.randomId(MovieId.class);
        this.genre= "";
        this.title= "";
        this.director= "";
        this.duration=Duration.ZERO;

    }



}
