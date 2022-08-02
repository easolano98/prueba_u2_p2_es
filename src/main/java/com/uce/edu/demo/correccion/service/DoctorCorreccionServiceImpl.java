package com.uce.edu.demo.correccion.service;
	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.repository.IDoctorCorreccionRepo;
import com.uce.edu.demo.correccion.repository.modelo.DoctorCorreccion;
@Service	
public class DoctorCorreccionServiceImpl  implements IDoctorCorreccionService{
	@Autowired
	private IDoctorCorreccionRepo correccionRepo;
	
	
	@Override
	public void insertar(DoctorCorreccion doctor) {
		// TODO Auto-generated method stub
		this.correccionRepo.insertar(doctor);
	}

	@Override
	public void actualizar(DoctorCorreccion doctor) {
		// TODO Auto-generated method stub
		this.correccionRepo.actualizar(doctor);
	}

	@Override
	public DoctorCorreccion buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.correccionRepo.buscar(codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		this.correccionRepo.eliminar(codigo);
	}

}
