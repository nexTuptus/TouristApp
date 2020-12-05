package Touristapp.controller;

import Touristapp.service.AddressService;
import lombok.AllArgsConstructor;
import Touristapp.model.dto.AddressDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class AddressController {

    private AddressService addressService;

    @GetMapping("/addresses")
    public ModelAndView getAllAddresses() {
        List<AddressDTO> addressDTOList = addressService.getAllAddresses();
        return new ModelAndView("addresses", "addressList", addressDTOList);
    }

}
