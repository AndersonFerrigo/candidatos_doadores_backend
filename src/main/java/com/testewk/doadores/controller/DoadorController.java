package com.testewk.doadores.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.testewk.doadores.entity.Doador;
import com.testewk.doadores.service.DoadorServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
@JsonIgnoreProperties
public class DoadorController {
	
	@Autowired
	private DoadorServiceImpl serviceImpl;
		
	@PostMapping
	public Doador createDoador(Doador doador) {
		return serviceImpl.create(doador); 
	}
		
	
}
