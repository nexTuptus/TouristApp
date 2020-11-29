package model.dto;

import lombok.Getter;
import lombok.Setter;
import model.jpa.AttractionType;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AttractionDTO {

    private Long id;
    private String name;
    private Enum<AttractionType> attractionType;
    private String description;
    private AddressDTO addressDTO;
    private List<AttractionRatingDTO> ratingsDTO = new ArrayList<>();

}
