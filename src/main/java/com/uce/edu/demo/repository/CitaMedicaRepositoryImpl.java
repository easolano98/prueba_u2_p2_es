package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.CitaMedica;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualizat(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public CitaMedica buscar(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedica> query = this.entityManager
				.createQuery("SELECT cm FROM CitaMedica cm WHERE cm.numero= :datoNumero", CitaMedica.class);
		query.setParameter("datoNumero", numero);
		return query.getSingleResult();
		
	}

}
