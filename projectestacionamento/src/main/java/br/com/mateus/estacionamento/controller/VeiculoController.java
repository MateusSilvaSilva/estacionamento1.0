package br.com.mateus.estacionamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mateus.estacionamento.model.Veiculo;
import br.com.mateus.estacionamento.service.VeiculoService;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;

	@GetMapping
	public List<Veiculo> listarTodos() {
		return veiculoService.findAll();
	}

	@PostMapping
	public Veiculo salvarCliente(@RequestBody Veiculo veiculo) {
		return veiculoService.save(veiculo);
	}

	@DeleteMapping
	public void deleteById(Long id) {
		veiculoService.deleteById(id);
	}
}