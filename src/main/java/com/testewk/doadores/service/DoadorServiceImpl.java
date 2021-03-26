package com.testewk.doadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testewk.doadores.entity.Doador;
import com.testewk.doadores.repository.DoadorRepository;

@Service
public class DoadorServiceImpl implements DoadorService {
	
	@Autowired
	private DoadorRepository repository;
	
	@Override
	public Doador create(Doador doador) {
		return repository.save(doador);
	}
	
	@Override
	public List<Doador> createFromJson(List<Doador> doadores) {
		return repository.saveAll(doadores);
	}

	
}
