package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICitaMedicaRepository;
import com.uce.edu.demo.repository.IDoctorRepository;
import com.uce.edu.demo.repository.IPacienteRepository;
import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.modelo.PacienteSencillo;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	
	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	private IPacienteRepository pacienteRepository;
	
	@Autowired 
	private IDoctorRepository doctorRepository;
	
	
	@Override
	public void insertar(String numero, LocalDateTime fecha, BigDecimal valor, String lugar, String docCedula,
			String paciCedula) {
		// TODO Auto-generated method stub
		CitaMedica citaMed= new CitaMedica();
		citaMed.setNumero(numero);
		citaMed.setFecha(fecha);
		citaMed.setValor(valor);
		citaMed.setLugar(lugar);
		citaMed.setDoctor(this.doctorRepository.buscarCedula(docCedula));
		citaMed.setPaciente(this.pacienteRepository.buscarCedula(paciCedula));
		this.citaMedicaRepository.insertar(citaMed);
	}

	@Override
	public void actualizar(String numero, String diagnostico, String receta, LocalDateTime citaProx) {
		// TODO Auto-generated method stub
		CitaMedica cita=this.citaMedicaRepository.buscar(numero);
		cita.setDiagnostico(diagnostico);
		cita.setReceta(receta);
		cita.setProxCita(citaProx);
		this.citaMedicaRepository.actualizat(cita);
	}

	@Override
	public List<PacienteSencillo> buscar(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscarPaciente(fecha, genero);
	}

}
