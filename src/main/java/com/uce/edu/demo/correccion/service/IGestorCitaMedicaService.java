package com.uce.edu.demo.correccion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorCitaMedicaService {
	public void agendarCita(String numero, LocalDateTime fechaCita, BigDecimal valorCita, String lugar, String cedulaDoct, String cedulaPaciente);
	
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime proxCita);
}
