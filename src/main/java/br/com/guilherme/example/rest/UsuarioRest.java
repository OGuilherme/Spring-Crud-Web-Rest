package br.com.guilherme.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilherme.example.business.UsuarioBusiness;

@RestController("api/usuario/")
public class UsuarioRest {
	
	@Autowired
	private UsuarioBusiness usuarioBusiness;

	@PostMapping(value = "cadastro")
	public ResponseEntity<Object> cadastro(){
		return null;
	}
	
	@PostMapping(value = "consulta")
	public ResponseEntity<Object> consulta(){
		return null;
	}
}
