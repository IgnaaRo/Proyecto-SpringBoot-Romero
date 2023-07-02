package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.EmpleadoDao;
import com.project.model.Empleado;

@RestController
public class EmpleadoController {
		
	@Autowired
	private EmpleadoDao empleadoDao;
		
	@RequestMapping (value="api/empleado")
	public List<Empleado> getEmpleado(){
	
		List<Empleado> user=empleadoDao.obtenerEmpleado();
			
		return user;
	}
}
