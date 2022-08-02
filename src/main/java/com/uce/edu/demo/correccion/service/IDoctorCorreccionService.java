package com.uce.edu.demo.correccion.service;

import com.uce.edu.demo.correccion.repository.modelo.DoctorCorreccion;

public interface IDoctorCorreccionService {
	
	public void insertar(DoctorCorreccion doctor);
	public void actualizar(DoctorCorreccion doctor);
	public DoctorCorreccion buscar(Integer codigo);
	public void  eliminar(Integer codigo);
	
	
}
