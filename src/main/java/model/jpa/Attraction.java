package model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Enum<AttractionType> attractionType;
    private String description;

    @ManyToOne
    private Address attractionAddress;

    @OneToMany(mappedBy = "attraction")
    private List<AttractionRating> ratings;

    public Attraction() {
    }

    public Attraction(Long id, String name, Enum<AttractionType> attractionType, String description, Address attractionAddress, List<AttractionRating> ratings) {
        this.id = id;
        this.name = name;
        this.attractionType = attractionType;
        this.description = description;
        this.attractionAddress = attractionAddress;
        this.ratings = ratings;
    }
}
