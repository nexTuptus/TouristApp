package model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;

    @ManyToOne
    private Address userAddress;

    @OneToMany(mappedBy = "user")
    private List<AttractionRating> ratings;

    public User() {
    }

    public User(Long id, String username, String password, String email,
                Address userAddress, List<AttractionRating> ratings) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.userAddress = userAddress;
        this.ratings = ratings;
    }
}
