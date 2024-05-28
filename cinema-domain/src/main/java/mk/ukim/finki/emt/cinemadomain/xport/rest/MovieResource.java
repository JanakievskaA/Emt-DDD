package mk.ukim.finki.emt.cinemadomain.xport.rest;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.cinemadomain.domain.models.Movie;
import mk.ukim.finki.emt.cinemadomain.service.Movieservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/movie")
@AllArgsConstructor
public class MovieResource {
    private final Movieservice movieservice;
    @GetMapping
    public List<Movie> getAll() {
        return movieservice.getAll();
    }

}
