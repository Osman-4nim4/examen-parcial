package com.example.demo.service;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClientesDao;
import com.example.demo.entities.Pacientes;

@Service
public class PacienteServicempl implements PacienteService{

	@Autowired
	ClientesDao clientesDao;
	
	@Override
	public List<Pacientes> findAll () {
		return (List<Pacientes>) clientesDao.findAll();
	}

	@Override
	public Pacientes findByid() {
		// TODO Auto-generated method stub
		return clientesDao.findById(null).orElse(null);
	}

}

	
