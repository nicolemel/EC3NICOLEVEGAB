package com.idat.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.Dto.HospitalDtoRequest;
import com.idat.model.Hospital;
import com.idat.service.HospitalServiceImpl;


@RestController
@RequestMapping("/hospital")
@CrossOrigin(origins = "*")
public class HospitalController {
	 @Autowired
	 HospitalServiceImpl serv;
	 @RequestMapping(path = "/guardar", method = RequestMethod.POST)
	 public ResponseEntity<Object> registrar(@RequestBody HospitalDtoRequest Hospital)
	 {
			Map<String, Object> errors = new LinkedHashMap<>();
			Map<String, Object> exito = new LinkedHashMap<>();
		try {
			serv.registro(Hospital);
			exito.put("message", "Hospital registrado");
			return new ResponseEntity<>(exito,HttpStatus.CREATED);
			
		}catch (Exception e) {
			// TODO: handle exception
			errors.put("message", "Error al Registrar");
			return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);}
		}

		@RequestMapping(path = "/actualizar", method = RequestMethod.PUT)
		public ResponseEntity<Object> actualizar(@RequestBody HospitalDtoRequest Hospital){
			
			Map<String, Object> errors = new LinkedHashMap<>();
			Map<String, Object> exito = new LinkedHashMap<>();
		try {
			serv.actualizarHospital(Hospital);
			exito.put("message", "Hospital actualizado");
			return new ResponseEntity<>(exito,HttpStatus.OK);
			
		}catch (Exception e) {
			// TODO: handle exception
			errors.put("message", "Error al Actualizar");
			return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);
		}
			
		
		}
		
		
		@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
		public ResponseEntity<Object> listarId(@PathVariable Integer id){
			
			Map<String, Object> errors = new LinkedHashMap<>();
			Map<String, Object> exito = new LinkedHashMap<>();
		try {
			Hospital Hospital =serv.buscarId(id);
			exito.put("content", Hospital);
			exito.put("message", "Hospital encontrado");
			return new ResponseEntity<>(exito,HttpStatus.OK);
			
		}catch (Exception e) {
			// TODO: handle exception
			errors.put("message", "Error Hospital no encontrado");
			return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);
		}
			
		
		}
		
		@RequestMapping(path = "/listar", method = RequestMethod.GET)
		public ResponseEntity<Object> listar(){
			
			Map<String, Object> errors = new LinkedHashMap<>();
			Map<String, Object> exito = new LinkedHashMap<>();
		try {
			List<Hospital> Hospital =serv.listar();
			exito.put("content", Hospital);
			exito.put("message", "Exito");
			return new ResponseEntity<>(exito,HttpStatus.OK);
			
		}catch (Exception e) {
			// TODO: handle exception
			errors.put("message", "Error");
			return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);
		}
			
		
		}
		
		@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<Object> eliminar(@PathVariable Integer id){
			
			Map<String, Object> errors = new LinkedHashMap<>();
			Map<String, Object> exito = new LinkedHashMap<>();
		try {
			serv.eliminar(id);
			exito.put("message", "Hospital eliminado");
			return new ResponseEntity<>(exito,HttpStatus.OK);
			
		}catch (Exception e) {
			// TODO: handle exception
			errors.put("message", "Error al eliminar");
			return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);
		}
			
		
		}

}
