package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaRepository {
	
	public void insertar(CitaMedica citaMedica);
	public void actualizat(CitaMedica citaMedica);
	public CitaMedica buscar(String numero);
	
	
	
}
