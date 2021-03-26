package com.testewk.doadores.service;

import java.util.List;

import com.testewk.doadores.entity.Doador;

public interface DoadorService {
	
	Doador create(Doador doador);
	List<Doador> createFromJson(List<Doador> doadores);
	
}
