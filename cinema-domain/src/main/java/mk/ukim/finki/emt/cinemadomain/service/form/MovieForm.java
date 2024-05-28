package mk.ukim.finki.emt.cinemadomain.service.form;

import lombok.Data;
import mk.ukim.finki.emt.cinemadomain.domain.models.Cinema;
import mk.ukim.finki.emt.cinemadomain.domain.models.Hall;

import java.time.Duration;

@Data
public class MovieForm {
    private String genre;
    private String title;
    private String director;
    private Duration duration;
    private Cinema cinema;
    private Hall hall;

}
