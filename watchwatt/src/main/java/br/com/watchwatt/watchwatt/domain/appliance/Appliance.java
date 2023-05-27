package br.com.watchwatt.watchwatt.domain.appliance;

public class Appliance {

    String name;
    String model;
    int power; //potência do equipamento
    Long id;

    public Appliance() {
    }

    public Appliance(String name, String model, int power, Long id) {
        this.name = name;
        this.model = model;
        this.power = power;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Appliance setName(String name) {
        this.name = name;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Appliance setModel(String model) {
        this.model = model;
        return this;
    }

    public int getPower() {
        return power;
    }

    public Appliance setPower(int power) {
        this.power = power;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Appliance setId(Long id) {
        this.id = id;
        return this;
    }
}
