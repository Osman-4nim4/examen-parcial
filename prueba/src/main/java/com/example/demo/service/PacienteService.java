package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Pacientes;


public interface PacienteService {

	public List<Pacientes> findAll();
	public Pacientes findByid();

}
              