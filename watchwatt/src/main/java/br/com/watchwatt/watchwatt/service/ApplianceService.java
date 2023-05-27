package br.com.watchwatt.watchwatt.service;

import br.com.watchwatt.watchwatt.domain.appliance.Appliance;
import br.com.watchwatt.watchwatt.domain.appliance.dto.DataRegister;
import br.com.watchwatt.watchwatt.domain.appliance.ApplianceRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplianceService {

    @Autowired
    private ApplianceRepository repository;

    public Appliance cadastrar(@Valid DataRegister data) {

        Appliance appliance = repository.findByApplianceId(data.id());

        if(appliance != null) {

            throw new RuntimeException("Equipamento já cadastrado ");
        }

        var appliance1 = new Appliance(data.name(),data.model(),data.power());

        // repository.save(newaddress);
        return repository.save(appliance1);

    }
}
