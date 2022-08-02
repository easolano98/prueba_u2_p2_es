package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.correccion.repository.modelo.DoctorCorreccion;
import com.uce.edu.demo.correccion.repository.modelo.PacienteCorreccion;
import com.uce.edu.demo.correccion.service.IDoctorCorreccionService;
import com.uce.edu.demo.correccion.service.IGestorCitaMedicaService;
import com.uce.edu.demo.correccion.service.IPacienteCorreccionService;

@SpringBootApplication
public class PruebaU2P2EsApplication implements CommandLineRunner {
	private static final Logger LOGGER = Logger.getLogger(PruebaU2P2EsApplication.class);
	@Autowired
	private IPacienteCorreccionService pacienteCorreccionService;
	
	@Autowired
	private IDoctorCorreccionService doctorCorreccionService;
	
	@Autowired
	private IGestorCitaMedicaService citaMedicaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaU2P2EsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		DoctorCorreccion doctor1=new DoctorCorreccion();
		doctor1.setNombre("Erick ");
		doctor1.setApellido("Solano");
		doctor1.setCedula("17152023");
		doctor1.setFechaNacimiento(LocalDateTime.now());
		doctor1.setCodigoSenecyt("1234");
		doctor1.setGenero("M");
		doctor1.setNumeroConsultorio("1235A");
		
		//this.doctorCorreccionService.insertar(doctor1);

		DoctorCorreccion doctor2=new DoctorCorreccion();
		doctor2.setNombre("Pepe ");
		doctor2.setApellido("Solano");
		doctor2.setCedula("1700023");
		doctor2.setFechaNacimiento(LocalDateTime.now());
		doctor2.setCodigoSenecyt("5678");
		doctor2.setGenero("M");
		doctor2.setNumeroConsultorio("4575B");
		
		//this.doctorCorreccionService.insertar(doctor2);
		
		PacienteCorreccion paci1=new PacienteCorreccion();
		paci1.setNombre("Daniel");
		paci1.setApellido("Teran");
		paci1.setCedula("051234");
		paci1.setFechaNacimiento(LocalDateTime.of(1996, 12,2,8,56));
		paci1.setCodigoSeguro("ea123");
		paci1.setEstatura(new Double(1.80));
		paci1.setPeso(new Double(20));
		paci1.setGenero("M");
		
		//this.pacienteCorreccionService.insertar(paci1);
		
		PacienteCorreccion paci2=new PacienteCorreccion();
		paci2.setNombre("Daniela");
		paci2.setApellido("Perez");
		paci2.setCedula("0503250");
		paci2.setFechaNacimiento(LocalDateTime.of(1990, 12,2,8,56));
		paci2.setCodigoSeguro("ea456");
		paci2.setEstatura(new Double(1.80));
		paci2.setPeso(new Double(20));
		paci2.setGenero("M");
		
		//this.pacienteCorreccionService.insertar(paci2);
		
		//this.citaMedicaService.agendarCita("1", LocalDateTime.now(), new BigDecimal(8), "El INCA", "1700023", "0503250");
		
		this.citaMedicaService.actualizarCita("1", "Gripe", "Paracetamol", LocalDateTime.now());
	
	}

}
