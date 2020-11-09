package br.com.mateus.estacionamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mateus.estacionamento.model.StatusVaga;
import br.com.mateus.estacionamento.model.TicketEstacionamento;
import br.com.mateus.estacionamento.service.TicketEstacionamentoService;

@RestController
@RequestMapping("/ticket")
public class TicketEstacionamentoController {

	@Autowired
	private TicketEstacionamentoService ticketEstacionamentoService;

	@GetMapping("/{status}")
	public String Status(@PathVariable("status") String status, Model model) {
		List<TicketEstacionamento> vagas = ticketEstacionamentoService
				.findByStatus(StatusVaga.valueOf(status.toUpperCase()));
		model.addAttribute("vagas", vagas);
		model.addAttribute("status", status);
		return ticketEstacionamentoService.findByStatus(vagas);
	}

}
