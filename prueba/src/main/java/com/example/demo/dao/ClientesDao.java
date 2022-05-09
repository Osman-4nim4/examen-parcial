package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Pacientes;

public interface ClientesDao extends CrudRepository<Pacientes, Long> {

}
