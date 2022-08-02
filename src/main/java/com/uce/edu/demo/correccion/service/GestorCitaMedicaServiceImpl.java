package com.uce.edu.demo.correccion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.repository.ICitaMedicaCorreccionRepository;
import com.uce.edu.demo.correccion.repository.IDoctorCorreccionRepo;
import com.uce.edu.demo.correccion.repository.IPacienteCorreccionRepository;
import com.uce.edu.demo.correccion.repository.modelo.CitaMedicaCorreccion;
import com.uce.edu.demo.correccion.repository.modelo.DoctorCorreccion;
import com.uce.edu.demo.correccion.repository.modelo.PacienteCorreccion;
@Service
public class GestorCitaMedicaServiceImpl implements IGestorCitaMedicaService{
	
	@Autowired
	private ICitaMedicaCorreccionService citaMedicaCorreccionService;
	
	@Autowired
	private IDoctorCorreccionRepo correccionRepo;
	
	@Autowired
	private IPacienteCorreccionRepository pacienteCorreccionRepository;
	
	@Autowired
	private ICitaMedicaCorreccionRepository citCorreccionRepository;
	
	@Override
	public void agendarCita(String numero, LocalDateTime fechaCita, BigDecimal valorCita, String lugar,
			String cedulaDoct, String cedulaPaciente) {
		// TODO Auto-generated method stub
		CitaMedicaCorreccion citaMedica=new CitaMedicaCorreccion();
		citaMedica.setNumero(numero);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setValor(valorCita);
		citaMedica.setLugar(lugar);
		
		DoctorCorreccion miDoctor=this.correccionRepo.buscarPorCedula(cedulaDoct);
		PacienteCorreccion miPaciente=this.pacienteCorreccionRepository.buscarPorCedula(cedulaPaciente);
		
		citaMedica.setDoctor(miDoctor);
		citaMedica.setPaciente(miPaciente);
		
		
		this.citaMedicaCorreccionService.insertar(citaMedica);
	}



	@Override
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime proxCita) {
		// TODO Auto-generated method stub
		CitaMedicaCorreccion cita=this.citCorreccionRepository.buscarPorNumero(numero);
		cita.setDiagnostico(diagnostico);
		cita.setReceta(receta);
		cita.setFechaProximaCita(proxCita);
		
		this.citCorreccionRepository.actualizar(cita);
		
	}
	
}
