package com.testewk.doadores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testewk.doadores.entity.Doador;


@Repository
public interface DoadorRepository extends JpaRepository<Doador, Long> {
	
			
}
