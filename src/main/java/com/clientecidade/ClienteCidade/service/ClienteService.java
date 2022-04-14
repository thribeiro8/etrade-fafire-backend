package com.clientecidade.ClienteCidade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clientecidade.ClienteCidade.entity.Cliente;
import com.clientecidade.ClienteCidade.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente findId(Long id) {
		return clienteRepository.getById(id);
	}

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public Cliente save(Cliente cli) {
		return clienteRepository.save(cli);
	}

	public void delete(Cliente cli) {
		if(clienteRepository.existsById(cli.getCodCli())) {
			clienteRepository.delete(cli);
		}
	}
	
	public List<Cliente> findName(String nome) {
		return clienteRepository.findByNome(nome);
	}
	
}
