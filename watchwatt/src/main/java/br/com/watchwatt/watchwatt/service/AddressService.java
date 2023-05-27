package br.com.watchwatt.watchwatt.service;

import br.com.watchwatt.watchwatt.domain.address.Address;
import br.com.watchwatt.watchwatt.domain.address.AddressRepository;
import br.com.watchwatt.watchwatt.domain.address.dto.DataRegister;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public Address cadastrar(@Valid DataRegister data) {

        Address address = repository.findByZipCodeAndNumber(data.zipCode(),data.number());

        if(address != null) {

            throw new RuntimeException("Endereço já cadastrado ");
        }

        var newaddress = new Address(data.zipCode(),data.number());

       // repository.save(newaddress);
        return repository.save(newaddress);

    }
}
