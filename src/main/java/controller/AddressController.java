package controller;

import model.dto.AddressDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.AddressService;

import java.util.List;

@Controller
public class AddressController {

    private AddressService addressService;

    @GetMapping("/addresses")
    public ModelAndView getAllAddresses() {
        List<AddressDTO> addressDTOList = addressService.getAllAddresses();
        return new ModelAndView("addresses", "addressList", addressDTOList);
    }

}
