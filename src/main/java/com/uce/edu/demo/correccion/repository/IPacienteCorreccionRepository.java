package com.uce.edu.demo.correccion.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.correccion.repository.modelo.PacienteCorreccion;
import com.uce.edu.demo.correccion.repository.modelo.PacienteSencilloCorreccion;

public interface IPacienteCorreccionRepository {
	public void insertar(PacienteCorreccion paciente);
	public void actualizar(PacienteCorreccion paciente);
	public PacienteCorreccion buscar(Integer codigo);
	public void  eliminar(Integer codigo);
	public PacienteCorreccion buscarPorCedula(String cedula);
	public List<PacienteSencilloCorreccion> buscar(LocalDateTime fecha, String genero);	
	
	
}
