package model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AddressDTO {

    private Long id;
    private String voivodeship;
    private String community;
    private String locality;
    private List<UserDTO> usersDTO = new ArrayList<>();
    private List<AttractionDTO> attractionsDTO = new ArrayList<>();

}
