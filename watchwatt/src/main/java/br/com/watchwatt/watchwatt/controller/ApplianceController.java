package br.com.watchwatt.watchwatt.controller;

import br.com.watchwatt.watchwatt.domain.appliance.dto.DataRegister;
import br.com.watchwatt.watchwatt.domain.appliance.Appliance;
import br.com.watchwatt.watchwatt.service.ApplianceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Controller
@RequestMapping("/appliance")
public class ApplianceController {

    @Autowired
    private ApplianceService service;

    @PostMapping
    public ResponseEntity<Appliance> cadastrar (@RequestBody @Valid DataRegister data, UriComponentsBuilder uriBuilder) {

        Appliance appliance = service.cadastrar(data);

        URI uri = uriBuilder.path("/appliance/{id}").buildAndExpand(appliance).toUri();

        return ResponseEntity.created(uri).body(appliance);

    }
}
