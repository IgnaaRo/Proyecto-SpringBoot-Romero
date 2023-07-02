package com.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.model.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoDaoImp implements EmpleadoDao  {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Empleado> obtenerEmpleado() {
		
		String query= "from Empleado";
		
		return entityManager.createQuery(query).getResultList();
	}

}
