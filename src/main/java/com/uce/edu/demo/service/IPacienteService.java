package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.modelo.PacienteSencillo;

public interface IPacienteService {
	public void insertar(Paciente paciente);

	public void eliminar(Integer id);

	public void actualizar(Paciente paciente);

	public Paciente buscar(Integer id);
	
	public List<PacienteSencillo> buscarPaciente(LocalDateTime fecha, String genero);
}
