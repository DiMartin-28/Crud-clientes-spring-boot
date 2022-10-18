package com.diazmartin.springboot.app.models.dao.service;

import java.util.List;

import com.diazmartin.springboot.app.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);

}
