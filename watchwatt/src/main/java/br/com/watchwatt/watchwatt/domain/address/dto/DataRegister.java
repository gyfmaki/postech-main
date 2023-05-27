package br.com.watchwatt.watchwatt.domain.address.dto;

public record DataRegister(
        String street,
        String neighborhood,
        String zipCode,
        int number,
        String city,
        String state,
        String country,
        Long id) {

}
