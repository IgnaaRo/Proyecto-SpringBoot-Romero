package com.project.dao;

import java.util.List;

import com.project.model.Empleado;

import jakarta.transaction.Transactional;

@Transactional
public interface EmpleadoDao {
	
	List<Empleado> obtenerEmpleado();

}
