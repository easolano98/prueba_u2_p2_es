package com.uce.edu.demo.correccion.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.repository.modelo.CitaMedicaCorreccion;
@Repository
@Transactional
public class CitaMedicaCorreccionRepositoryImpl implements ICitaMedicaCorreccionRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(CitaMedicaCorreccion citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}


	@Override
	public void actualizar(CitaMedicaCorreccion citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}


	@Override
	public CitaMedicaCorreccion buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedicaCorreccion> query=this.entityManager.createQuery("select c from CitaMedicaCorreccion c where c.numero=: datoNumero", CitaMedicaCorreccion.class);
		query.setParameter("datoNumero", numero);
		return query.getSingleResult();
	}
	
}
