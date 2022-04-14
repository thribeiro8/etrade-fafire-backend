package com.clientecidade.ClienteCidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clientecidade.ClienteCidade.entity.Cliente;
import com.clientecidade.ClienteCidade.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@PostMapping(consumes  = "application/json")
	public Cliente adicionar(@RequestBody Cliente cli) {
		return clienteService.save(cli);
	}

	@GetMapping
	public List<Cliente> listaTodos() {
		return clienteService.findAll();
	}

	@GetMapping(path = "/{id}")
	public Cliente clientePorId(@PathVariable Long id) {
		return clienteService.findId(id);
	}
	
	@GetMapping(path = "/nome/{nome}")
	public List<Cliente> clientePorNome(@PathVariable String nome) {
		return clienteService.findName(nome);
	}
}
