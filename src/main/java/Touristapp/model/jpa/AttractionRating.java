package Touristapp.model.jpa;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AttractionRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("attractionId")
    @JoinColumn(name = "attraction_id")
    private Attraction attraction;

    private Enum<Rating> rating;
    private String opinion;

}
