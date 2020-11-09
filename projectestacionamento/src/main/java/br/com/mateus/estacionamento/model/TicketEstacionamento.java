package br.com.mateus.estacionamento.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Tb_Ticket")
public class TicketEstacionamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "data_entrada", nullable = true)
	private LocalDateTime dataEntrada;

	@Column(name = "data_saida", nullable = false)
	private LocalDateTime dataSaida;
	
	@Column(name = "valor", nullable = false)
	private double valor = 40.0;
	
	@Column(name = "vaga", nullable = false)
	@Enumerated(EnumType.STRING)
	private StatusVaga status = StatusVaga.LIVRE;
	
	
	@ManyToOne
	@JoinColumn(name = "fk_id_Cliente")
	private Cliente cliente;

	public TicketEstacionamento() {

	}

	public TicketEstacionamento(Long id, LocalDateTime dataEntrada, LocalDateTime dataSaida, double valor) {
		this.id = id;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDateTime dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDateTime getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDateTime dataSaida) {
		this.dataSaida = dataSaida;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "TicketEstacionamento [id=" + id + ", DataEntrada=" + dataEntrada +
				", DataSaida=" + dataSaida + ", Valor=" + valor + "]";
	}
}