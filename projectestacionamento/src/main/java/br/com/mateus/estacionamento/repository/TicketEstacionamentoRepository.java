package br.com.mateus.estacionamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mateus.estacionamento.model.TicketEstacionamento;

@Repository
public interface TicketEstacionamentoRepository extends JpaRepository<TicketEstacionamento, Long> {

	String save(List<TicketEstacionamento> vagas);

	

}