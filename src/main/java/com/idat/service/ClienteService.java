package com.idat.service;

import java.util.List;

import com.idat.Dto.ClienteDtoRequest;
import com.idat.model.Cliente;

public interface ClienteService {

	public void registo(ClienteDtoRequest cliente);
	public void actualizarCliente(ClienteDtoRequest cliente);
	public List<Cliente> listar();
	public Cliente buscarId(Integer id);
	public void eliminar(Integer id);
	
}