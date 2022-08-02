package com.uce.edu.demo.correccion.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.repository.modelo.PacienteCorreccion;
import com.uce.edu.demo.correccion.repository.modelo.PacienteSencilloCorreccion;

@Repository
@Transactional
public class PacienteCorreccionRepositoryImpl implements IPacienteCorreccionRepository {


	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(PacienteCorreccion paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public void actualizar(PacienteCorreccion paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public PacienteCorreccion buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.entityManager.find(PacienteCorreccion.class, codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		PacienteCorreccion paciente=this.buscar(codigo);
		this.entityManager.remove(paciente);
	}
	
	
	@Override
	public PacienteCorreccion buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<PacienteCorreccion>myQuery=this.entityManager.createQuery("select p from PacienteCorreccion p where p.cedula=:datoCedula", PacienteCorreccion.class);
		myQuery.setParameter("datoCedula",cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public List<PacienteSencilloCorreccion> buscar(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		TypedQuery<PacienteSencilloCorreccion>query=this.entityManager.createQuery("SELECT NEW com.uce.edu.demo.repository.modelo.PacienteSencilloCorreccion(p.cedula, p.nombre, p.fechaNacimiento, p.genero) FROM Paciente p WHERE p.fechaNacimiento>:datoFecha and p.genero= :datoGenero", PacienteSencilloCorreccion.class);
		query.setParameter("datoFecha", fecha);
		query.setParameter("datoGenero", genero);
		return query.getResultList();
	}
	
}
