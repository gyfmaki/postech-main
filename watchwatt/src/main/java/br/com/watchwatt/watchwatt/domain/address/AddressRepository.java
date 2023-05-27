package br.com.watchwatt.watchwatt.domain.address;

import br.com.watchwatt.watchwatt.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AddressRepository extends JpaRepository<Address, Long> {

        Address findByZipCodeAndNumber(String zipCode, int number);

}
