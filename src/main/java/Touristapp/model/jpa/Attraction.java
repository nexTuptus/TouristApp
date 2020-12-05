package Touristapp.model.jpa;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Enum<AttractionType> attractionType;
    private String description;

    @ManyToOne
    private Address attractionAddress;

    @OneToMany(mappedBy = "attraction")
    private List<AttractionRating> ratings = new ArrayList<>();

}
