package br.com.watchwatt.watchwatt.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.watchwatt.watchwatt.domain.user.dto.DataRegister;
import br.com.watchwatt.watchwatt.service.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController { // Classe denominada UserController que possui o método "cadastrar" mapeada para a rota "/user".

	@Autowired // Injeta uma instância na classe domain "UserService" para verificar se o usuário já existe através do CPF.
	private UserService service;
	
	@PostMapping
	public ResponseEntity cadastrar (@RequestBody  @Valid DataRegister data, UriComponentsBuilder uriBuilder) {
		
		Long idUser = service.cadastrar(data);
		
		URI uri = uriBuilder.path("/user/{id}").buildAndExpand(idUser).toUri();
		
		return ResponseEntity.created(uri).body("Usuário cadastrado com sucesso");
		
	}
	
	
}
