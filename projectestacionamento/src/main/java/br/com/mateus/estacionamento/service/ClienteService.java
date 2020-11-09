package br.com.mateus.estacionamento.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.mateus.estacionamento.model.Cliente;

@Service
public interface ClienteService {

	List<Cliente> findAll();

	Cliente save(Cliente cliente);

	void deleteById(Long id);
	
	}