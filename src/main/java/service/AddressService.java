package service;

import lombok.AllArgsConstructor;
import model.jpa.Address;
import org.springframework.stereotype.Service;
import repository.AddressRepository;

@Service
@AllArgsConstructor
public class AddressService {

    private AddressRepository addressRepository;

    public void addAddress(Address address) {
        addressRepository.save(address);
    }
}
