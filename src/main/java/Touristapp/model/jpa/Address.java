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
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    private String voivodeship;
    private String community;
    private String locality;

    @OneToMany(mappedBy = "userAddress")
    private List<User> users = new ArrayList<>();

    @OneToMany(mappedBy = "attractionAddress")
    private List<Attraction> attractions = new ArrayList<>();

}
