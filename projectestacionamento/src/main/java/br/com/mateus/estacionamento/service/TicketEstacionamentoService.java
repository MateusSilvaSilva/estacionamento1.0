package br.com.mateus.estacionamento.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.mateus.estacionamento.model.StatusVaga;
import br.com.mateus.estacionamento.model.TicketEstacionamento;

@Service
public interface TicketEstacionamentoService {

	String findByStatus(List<TicketEstacionamento> vagas);

	List<TicketEstacionamento> findByStatus(StatusVaga vagas);

	Double calculoValorHora(LocalDateTime entrada, LocalDateTime saida, Double valor);

}