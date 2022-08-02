package com.uce.edu.demo.correccion.repository;

import com.uce.edu.demo.correccion.repository.modelo.CitaMedicaCorreccion;

public interface ICitaMedicaCorreccionRepository {
	
	public void insertar(CitaMedicaCorreccion citaMedica);
	
	public void actualizar(CitaMedicaCorreccion citaMedica);
	
	public CitaMedicaCorreccion buscarPorNumero(String numero);
}
