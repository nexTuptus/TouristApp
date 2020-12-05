package Touristapp.model.dto;

import lombok.Getter;
import lombok.Setter;
import Touristapp.model.jpa.Rating;

@Getter
@Setter
public class AttractionRatingDTO {

    private Long id;
    private UserDTO userDTO;
    private AttractionDTO attractionDTO;
    private Enum<Rating> rating;
    private String opinion;

}
