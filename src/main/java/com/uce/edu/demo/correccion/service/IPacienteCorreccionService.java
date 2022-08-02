package com.uce.edu.demo.correccion.service;

import com.uce.edu.demo.correccion.repository.modelo.PacienteCorreccion;

public interface IPacienteCorreccionService {
	public void insertar(PacienteCorreccion paciente);
	public void actualizar(PacienteCorreccion paciente);
	public PacienteCorreccion buscar(Integer codigo);
	public void  eliminar(Integer codigo);
	
}
