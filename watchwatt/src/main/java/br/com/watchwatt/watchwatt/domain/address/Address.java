package br.com.watchwatt.watchwatt.domain.address;

import jakarta.persistence.*;

@Table(name = "tb_address")
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//gerar id unico sequencial
    Long id;
    String street;
    String neighborhood;
    String zipCode;
    int number;
    String city;
    String state;
    String country;

    public Address() {
    }

    public Address(Long id,String street, String neighborhood, String zipCode, int number, String city, String state, String country) {
        this.street = street;
        this.neighborhood = neighborhood;
        this.zipCode = zipCode;
        this.number = number;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Address(String zipCode, int number){
        this.zipCode = zipCode;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public Address setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Address setNumber(int number) {
        this.number = number;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }


}
