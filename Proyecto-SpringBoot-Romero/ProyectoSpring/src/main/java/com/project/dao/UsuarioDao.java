package com.project.dao;

import java.util.List;

import com.project.model.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {
	
	List<Usuario> obtenerUsuarios();

}
