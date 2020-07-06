package com.algaworks.osworks.api.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.demain.model.Cliente;

@RestController
public class ClienteController {
	
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Rafael Batista de Oliveira");
		cliente1.setTelefone("11 94530-4277");
		cliente1.setEmail("rbatistaa321@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Bruna de Oliveira Souza");
		cliente2.setTelefone("11 94782-1278");
		cliente2.setEmail("boliveira820@gmail.com");
		return Arrays.asList(cliente1, cliente2);
		
	}
	

	
}
