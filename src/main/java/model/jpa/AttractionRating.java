package model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class AttractionRating {

    @EmbeddedId
    private AttractionRatingKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("attractionId")
    @JoinColumn(name = "attraction_id")
    private Attraction attraction;

    private int rating;

    public AttractionRating() {
    }

    public AttractionRating(AttractionRatingKey id, User user, Attraction attraction, int rating) {
        this.id = id;
        this.user = user;
        this.attraction = attraction;
        this.rating = rating;
    }
}
