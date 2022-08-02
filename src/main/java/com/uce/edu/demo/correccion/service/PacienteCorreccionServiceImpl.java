package com.uce.edu.demo.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.repository.IPacienteCorreccionRepository;
import com.uce.edu.demo.correccion.repository.modelo.PacienteCorreccion;

@Service
public class PacienteCorreccionServiceImpl implements IPacienteCorreccionService {
	
	@Autowired
	private IPacienteCorreccionRepository correccionRepository;
	
	@Override
	public void insertar(PacienteCorreccion paciente) {
		// TODO Auto-generated method stub
		this.correccionRepository.insertar(paciente);
	}

	@Override
	public void actualizar(PacienteCorreccion paciente) {
		// TODO Auto-generated method stub
		this.correccionRepository.actualizar(paciente);
	}

	@Override
	public PacienteCorreccion buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.correccionRepository.buscar(codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		this.correccionRepository.eliminar(codigo);
	}

}
