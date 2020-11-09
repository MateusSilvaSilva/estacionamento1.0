package br.com.mateus.estacionamento.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.mateus.estacionamento.model.Cliente;
import br.com.mateus.estacionamento.repository.ClienteRepository;
import br.com.mateus.estacionamento.service.ClienteService;

@Service
public class ClienteServImplement implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> findAll() {
		return this.clienteRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		clienteRepository.deleteById(id);
	}

}