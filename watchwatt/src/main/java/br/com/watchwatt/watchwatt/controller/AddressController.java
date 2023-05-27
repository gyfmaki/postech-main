package br.com.watchwatt.watchwatt.controller;

import br.com.watchwatt.watchwatt.domain.address.Address;
import br.com.watchwatt.watchwatt.domain.address.dto.DataRegister;
import br.com.watchwatt.watchwatt.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping("/address")
public class AddressController { // Classe denominada UserController que possui o método "cadastrar" mapeada para a rota "/user".

    //TODO:validar endereço unico
    @Autowired
    // Injeta uma instância na classe domain "UserService" para verificar se o usuário já existe através do CPF.
    private AddressService service;

        @PostMapping
        public ResponseEntity<Address> cadastrar (@RequestBody @Valid DataRegister data, UriComponentsBuilder uriBuilder) {

            Address address = service.cadastrar(data);

            URI uri = uriBuilder.path("/address/{zipCode}").buildAndExpand(address).toUri();

            return ResponseEntity.created(uri).body(address);

        }
}
