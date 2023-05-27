package br.com.watchwatt.watchwatt.domain.appliance.dto;

public record DataRegister(
        String name,
        String model,
        int power,
        Long id
) {
}
