package com.idat.service;

import java.util.List;

import com.idat.Dto.UsuarioClienteDtoRequest;

import com.idat.model.UsuarioCliente;

public interface UsuarioClienteService {

	public void registro(UsuarioClienteDtoRequest usrCliente);
	public void actualizar(UsuarioClienteDtoRequest usrCliente);
	public List<UsuarioCliente> listar();
	public UsuarioCliente buscarId(Integer id);
	public void eliminar(Integer id);
}