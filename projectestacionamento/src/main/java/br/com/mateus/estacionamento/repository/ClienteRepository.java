package br.com.mateus.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mateus.estacionamento.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}