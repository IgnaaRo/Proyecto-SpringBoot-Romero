package com.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.model.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Usuario> obtenerUsuarios() {
		
		String query= "from Usuario";
		
		//hay dos maneras de escribirlo
		//1era Manera:
		//List<Usuario> resultado=entityManager.createQuery(query).getResultList();
		//return resultado;
		
		//2da Manera:
		return entityManager.createQuery(query).getResultList();
	}
	
	

}
