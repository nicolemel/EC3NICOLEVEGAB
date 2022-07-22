package com.idat.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Dto.HospitalDtoRequest;
import com.idat.model.Hospital;
import com.idat.repository.HospitalRepository;


@Service
public class HospitalServiceImpl implements HospitalService{

    @Autowired
    HospitalRepository repo;

    @Override
    public void registro(HospitalDtoRequest hospital) {
        Hospital h = new Hospital();
        h.setNombre(hospital.getNombreDto());
        h.setDescripcion(hospital.getDescripcionDto());
        h.setDistrito(hospital.getDistritoDto());
       repo.save(h);
    }

	@Override
	public void actualizarHospital(HospitalDtoRequest hospital) {
		// TODO Auto-generated method stub
		  Hospital h = new Hospital();
	        h.setNombre(hospital.getNombreDto());
	        h.setDescripcion(hospital.getDescripcionDto());
	        h.setDistrito(hospital.getDistritoDto());
	        h.setIdHospital(hospital.getId_hospítalDto());
	        repo.saveAndFlush(h);
	}

	@Override
	public List<Hospital> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Hospital buscarId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}


}
