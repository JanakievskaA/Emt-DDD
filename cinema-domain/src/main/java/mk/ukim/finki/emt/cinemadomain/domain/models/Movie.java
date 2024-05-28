package mk.ukim.finki.emt.cinemadomain.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;
import mk.ukim.finki.emt.sharedkernel.domain.base.location.Location;

import java.time.Duration;
import java.util.Objects;

@Entity
@Table(name="movies")
@Getter
public class Movie extends AbstractEntity<MovieId> {
  private String genre;
  private String title;
  private String director;
  private Duration duration;
  @ManyToOne
  private Cinema cinema;
  @ManyToOne
  private  Hall hall;

  protected Movie() {
    super(DomainObjectId.randomId(MovieId.class));
  }
  public Movie(String genre,String title,String director,Duration duration,Cinema cinema,Hall hall){
    super(MovieId.randomId(MovieId.class));
    this.director=director;
    this.duration=duration;
    this.genre=genre;
    this.title=title;
    this.cinema=cinema;
    this.hall=hall;


  }




}
