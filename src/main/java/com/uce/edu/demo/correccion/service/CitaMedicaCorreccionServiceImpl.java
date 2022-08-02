package com.uce.edu.demo.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.repository.ICitaMedicaCorreccionRepository;
import com.uce.edu.demo.correccion.repository.modelo.CitaMedicaCorreccion;

@Service
public class CitaMedicaCorreccionServiceImpl implements ICitaMedicaCorreccionService{

	@Autowired
	private ICitaMedicaCorreccionRepository citaMedicaCorreccionRepository;

	@Override
	public void insertar(CitaMedicaCorreccion citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaCorreccionRepository.insertar(citaMedica);
	}
}
