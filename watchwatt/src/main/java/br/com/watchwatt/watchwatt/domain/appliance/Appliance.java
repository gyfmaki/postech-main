package br.com.watchwatt.watchwatt.domain.appliance;

import jakarta.persistence.*;

@Table(name = "tb_appliance")
@Entity
public class Appliance {

    String name;
    String model;
    int power; //potência do equipamento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//gerar id unico sequencial
    Long applianceId;

    public Appliance() {
    }

    public Appliance(String name, String model, int power, Long id) {
        this.name = name;
        this.model = model;
        this.power = power;
        this.applianceId = id;
    }

    public Appliance(String name, String model, int power) {
        this.name = name;
        this.model = model;
        this.power = power;
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

    public Long getApplianceId() {
        return applianceId;
    }

    public Appliance setApplianceId(Long applianceId) {
        this.applianceId = applianceId;
        return this;
    }
}
