package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Dto.ClienteDtoRequest;
import com.idat.model.Cliente;
import com.idat.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	ClienteRepository repo;
	
	public void registo(ClienteDtoRequest cliente) {
		// TODO Auto-generated method stub
		Cliente cliente2 = new Cliente();
		
		cliente2.setCelular(cliente.getCelularDto());
		cliente2.setNombre(cliente.getNombreDto());
		repo.save(cliente2);
	}

	public void actualizarCliente(ClienteDtoRequest cliente) {
		// TODO Auto-generated method stub
		Cliente cliente2 = new Cliente();
		
		cliente2.setCelular(cliente.getCelularDto());
		cliente2.setIdCliente(cliente.getId_clienteDto());
		cliente2.setNombre(cliente.getNombreDto());
		repo.saveAndFlush(cliente2);
	}

	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	public Cliente buscarId(Integer id) {
		// TODO Auto-generated method stub
		
		
		return repo.findById(id).get();
	}

	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}