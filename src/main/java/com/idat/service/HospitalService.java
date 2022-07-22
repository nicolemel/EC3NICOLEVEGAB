package com.idat.service;

import java.util.List;

import com.idat.Dto.HospitalDtoRequest;
import com.idat.model.Hospital;

public interface HospitalService {
	public void registro(HospitalDtoRequest hospital);
	public void actualizarHospital(HospitalDtoRequest hospital);
	public List<Hospital> listar();
	public Hospital buscarId(Integer id);
	public void eliminar(Integer id);
}