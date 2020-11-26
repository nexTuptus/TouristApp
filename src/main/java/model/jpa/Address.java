package model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
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

    public Address() {
    }

    public Address(Long id, String voivodeship, String community, String locality,
                   List<User> users, List<Attraction> attractions) {
        this.id = id;
        this.voivodeship = voivodeship;
        this.community = community;
        this.locality = locality;
        this.users = users;
        this.attractions = attractions;
    }
}
