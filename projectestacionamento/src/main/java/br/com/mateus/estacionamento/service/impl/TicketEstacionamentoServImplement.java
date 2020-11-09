package br.com.mateus.estacionamento.service.impl;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mateus.estacionamento.model.StatusVaga;
import br.com.mateus.estacionamento.model.TicketEstacionamento;
import br.com.mateus.estacionamento.repository.TicketEstacionamentoRepository;
import br.com.mateus.estacionamento.service.TicketEstacionamentoService;

@Service
public class TicketEstacionamentoServImplement implements TicketEstacionamentoService{
	
	@Autowired
	TicketEstacionamentoRepository ticketEstacionamentoRepository;

	@Override
	public List<TicketEstacionamento> findByStatus(StatusVaga statusvaga) {
		return this.findByStatus(statusvaga);
	}

	@Override
	public String findByStatus(List<TicketEstacionamento> vagas) {
		return ticketEstacionamentoRepository.save(vagas);
		}


	@Override
	public Double calculoValorHora(LocalDateTime entrada, LocalDateTime saida, Double valor) {
		long minutos = ChronoUnit.MINUTES.between(entrada, saida);
		Double valorMin = valor / 60 ;
		Double resultado = (minutos * valorMin);
		return resultado;
	}
}
