package com.project.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.UsuarioDao;
import com.project.model.Usuario;

//lista un objeto
@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	/*
	@RequestMapping (value="usuarios")
	public Usuario listarUsuarios() {
		Usuario usuario= new Usuario();
		usuario.setNombre("Ana");
		usuario.setApellido("Maco");
		usuario.setTelefono("261897456");
		usuario.setEmail("amaco@gmail.com");
		usuario.setContraseña("al5869");
		
		return usuario;
	}
	
	//arma un id para Hardcodear
	@RequestMapping (value="usuarios/{id}")
	public Usuario getUsuario(@PathVariable Long id){
		Usuario usuario= new Usuario();
		
		usuario.setId(id);
		usuario.setNombre("Ana");
		usuario.setApellido("Maco");
		usuario.setTelefono("261897456");
		usuario.setEmail("amaco@gmail.com");
		usuario.setContraseña("al5869");
		
		return usuario;
	}
	
	//Coleccion de datos
	@RequestMapping (value="usuario/lista_user")
	public List<Usuario> listar_variosUsuarios(){
		List<Usuario> usuario= new ArrayList<>();
		
		Usuario usuario1= new Usuario();
		
		usuario1.setId(3L);
		usuario1.setNombre("Ana");
		usuario1.setApellido("Maco");
		usuario1.setTelefono("261897456");
		usuario1.setEmail("amaco@gmail.com");
		usuario1.setContraseña("al5869");
		
		Usuario usuario2= new Usuario();
		
		usuario2.setId(4L);
		usuario2.setNombre("Pedro");
		usuario2.setApellido("Marti");
		usuario2.setTelefono("261797456");
		usuario2.setEmail("m.pedro@gmail.com");
		usuario2.setContraseña("89639");
		
		usuario.add(usuario1);
		usuario.add(usuario2);
		
		return usuario;
	} */
	
	@RequestMapping (value="api/usuarios")
	public List<Usuario> getUsuario(){
		
		List<Usuario> user=usuarioDao.obtenerUsuarios();
		
		return user;
	}
	
	

}
