package br.com.mateus.estacionamento.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mateus.estacionamento.model.Veiculo;
import br.com.mateus.estacionamento.repository.VeiculoRepository;
import br.com.mateus.estacionamento.service.VeiculoService;

@Service
public class VeiculoServImplement implements VeiculoService {

	@Autowired
	VeiculoRepository veiculoRepository;

	@Override
	public Veiculo save(Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}

	@Override
	public List<Veiculo> findAll() {
		return this.veiculoRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		veiculoRepository.deleteById(id);

	}

}
