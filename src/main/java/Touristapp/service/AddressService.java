package Touristapp.service;

import Touristapp.repository.AddressRepository;
import lombok.AllArgsConstructor;
import Touristapp.model.dto.AddressDTO;
import Touristapp.model.jpa.Address;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AddressService {

    private AddressRepository addressRepository;
    private ModelMapper modelMapper;

    public void addAddress(AddressDTO addressDTO) {
        Address address = modelMapper.map(addressDTO, Address.class);
        addressRepository.save(address);
        System.out.println("Saved address with id: " + address.getId());
    }

    public List<AddressDTO> getAllAddresses() {
        return addressRepository
                .findAll()
                .stream()
                .map(address -> modelMapper.map(address, AddressDTO.class))
                .collect(Collectors.toList());
    }
}
