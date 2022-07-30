package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.PacienteSencillo;

public interface ICitaMedicaService {
	public void insertar(String numero, LocalDateTime fecha, BigDecimal valor, String lugar, String docCedula, String paciCedula);
	
	public void actualizar(String numero,  String diagnostico, String receta, LocalDateTime citaProx);
	
	public List<PacienteSencillo>buscar(LocalDateTime fecha, String genero);
	

	


}
