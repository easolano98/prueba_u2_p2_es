package com.uce.edu.demo.correccion.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.repository.modelo.DoctorCorreccion;

@Repository
@Transactional
public class DoctorCorreccionRepositoryImpl implements IDoctorCorreccionRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(DoctorCorreccion doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public void actualizar(DoctorCorreccion doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public DoctorCorreccion buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.entityManager.find(DoctorCorreccion.class, codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		DoctorCorreccion doctor= this.buscar(codigo);
		this.entityManager.remove(doctor);
	}

	@Override
	public DoctorCorreccion buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<DoctorCorreccion>myQuery=this.entityManager.createQuery("select d from DoctorCorreccion d where d.cedula=:datoCedula", DoctorCorreccion.class);
		myQuery.setParameter("datoCedula",cedula);
		return myQuery.getSingleResult();
	}

}
