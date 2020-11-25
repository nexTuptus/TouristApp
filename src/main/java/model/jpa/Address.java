package model.jpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String voivodeship;
    private String community;
    private String locality;

    @OneToMany(mappedBy = "userAddress")
    private List<User> users;

    @OneToMany(mappedBy = "attractionAddress")
    private List<Attraction> attractions;

}
