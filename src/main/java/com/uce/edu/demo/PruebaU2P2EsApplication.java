package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.service.ICitaMedicaService;
import com.uce.edu.demo.service.IDoctorService;
import com.uce.edu.demo.service.IPacienteService;

@SpringBootApplication
public class PruebaU2P2EsApplication implements CommandLineRunner {
	private static final Logger LOGGER = Logger.getLogger(PruebaU2P2EsApplication.class);
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired 
	private IPacienteService iPacienteService;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaU2P2EsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Doctor doc1 = new Doctor();
		doc1.setCedula("10500441231");
		doc1.setNombre("Erick");
		doc1.setApellido("Solano");
		doc1.setFechaNacimiento(LocalDateTime.of(1989, 3, 8, 12, 45));
		doc1.setConsultorio("8b");
		doc1.setCodSenecyt("1514");
		doc1.setGenero("masculino");
		LOGGER.debug("Insertando Doctor "+doc1);
		this.doctorService.insertar(doc1);
		
		Doctor doc2 = new Doctor();
		doc2.setCedula("2301020131");
		doc2.setNombre("Erika");
		doc2.setApellido("Iza");
		doc2.setFechaNacimiento(LocalDateTime.of(1998, 1, 8, 12, 45));
		doc2.setConsultorio("8b");
		doc2.setCodSenecyt("1514");
		doc2.setGenero("femenino");
		LOGGER.debug("Insertando Doctor "+doc2);
		this.doctorService.insertar(doc2);
		
		Paciente pac1 = new Paciente();
		pac1.setCedula("0494000259");
		pac1.setNombre("Carlos");
		pac1.setApellido("Pillajo");
		pac1.setFechaNacimiento(LocalDateTime.of(1995, 3, 4, 12, 30));
		pac1.setCodigo("17884");
		pac1.setEstatura("1.69m");
		pac1.setPeso("70kg");
		pac1.setGenero("masculino");
		LOGGER.debug("Insertando Paciente"+ pac1);
		this.iPacienteService.insertar(pac1);
		
		Paciente pac2 = new Paciente();
		pac2.setCedula("1103000259");
		pac2.setNombre("Fabricio");
		pac2.setApellido("Yepez");
		pac2.setFechaNacimiento(LocalDateTime.of(1995, 3, 4, 12, 30));
		pac2.setCodigo("1711");
		pac2.setEstatura("1.53m");
		pac2.setPeso("85kg");
		pac2.setGenero("masculino");
		LOGGER.debug("Insertando Paciente"+ pac2);
		this.iPacienteService.insertar(pac2);

		this.citaMedicaService.insertar("1", LocalDateTime.now(), new BigDecimal(5), "Caupichu", doc1.getCedula(), pac1.getCedula());
		
		this.citaMedicaService.actualizar("1", "COVID", "Paracetamol", LocalDateTime.of(2022,12,4,12,30));
		this.citaMedicaService.buscar(LocalDateTime.of(1970,12,4,12,30), "masculino");
		
	}

}
