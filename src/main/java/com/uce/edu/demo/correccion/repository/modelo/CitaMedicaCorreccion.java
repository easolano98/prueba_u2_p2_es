package com.uce.edu.demo.correccion.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="cita_medica_correccion")
public class CitaMedicaCorreccion {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="cime_id_sequence")
	@SequenceGenerator(name="cime_id_sequence",sequenceName = "cime_id_sequence", allocationSize = 1)
	@Column(name="cime_id")
	private Integer id;
	@Column(name="cime_numero")
	private String numero;
	@Column(name="cime_fecha_cita")
	private LocalDateTime fechaCita;
	@Column(name="cime_valor")
	private BigDecimal valor;
	@Column(name="cime_lugar")
	private String lugar;
	@Column(name="cime_diagnostico")
	private String diagnostico;
	@Column(name="cime_receta")
	private String receta;
	@Column(name="cime_fecha_proxima")
	private LocalDateTime fechaProximaCita;
	
	@ManyToOne
	@JoinColumn(name="doct_id")
	private DoctorCorreccion doctor;
	@ManyToOne
	@JoinColumn(name="paci_id")
	private PacienteCorreccion paciente;
	
	//SET y GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	public LocalDateTime getFechaProximaCita() {
		return fechaProximaCita;
	}
	public void setFechaProximaCita(LocalDateTime fechaProximaCita) {
		this.fechaProximaCita = fechaProximaCita;
	}
	public DoctorCorreccion getDoctor() {
		return doctor;
	}
	public void setDoctor(DoctorCorreccion doctor) {
		this.doctor = doctor;
	}
	public PacienteCorreccion getPaciente() {
		return paciente;
	}
	public void setPaciente(PacienteCorreccion paciente) {
		this.paciente = paciente;
	}

}
