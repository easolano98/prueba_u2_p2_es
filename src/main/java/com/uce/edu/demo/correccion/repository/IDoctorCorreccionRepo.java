package com.uce.edu.demo.correccion.repository;

import com.uce.edu.demo.correccion.repository.modelo.DoctorCorreccion;

public interface IDoctorCorreccionRepo {
	
	public void insertar(DoctorCorreccion doctor);
	public void actualizar(DoctorCorreccion doctor);
	public DoctorCorreccion buscar(Integer codigo);
	public void  eliminar(Integer codigo);
	public DoctorCorreccion buscarPorCedula(String cedula);
	
	
}
