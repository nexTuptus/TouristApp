package model.jpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Enum<AttractionType> attractionType;
    private String description;

    @ManyToOne
    private Address attractionAddress;

    @ManyToMany(mappedBy = "visitedAttractions")
    private List<User> users;

}
