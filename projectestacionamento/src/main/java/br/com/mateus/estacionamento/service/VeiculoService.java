package br.com.mateus.estacionamento.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.mateus.estacionamento.model.Veiculo;

@Service
public interface VeiculoService {

	List<Veiculo> findAll();

	Veiculo save(Veiculo veiculo);

	void deleteById(Long id);

}

