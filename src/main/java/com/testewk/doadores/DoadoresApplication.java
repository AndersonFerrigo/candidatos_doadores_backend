package com.testewk.doadores;

import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testewk.doadores.entity.Doador;
import com.testewk.doadores.repository.DoadorRepository;
import com.testewk.doadores.service.DoadorService;

@SpringBootApplication
@EnableJpaRepositories
public class DoadoresApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DoadoresApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(DoadorService doadorService, DoadorRepository repository) {
		return args ->{
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Doador>> typeReference = new TypeReference<List<Doador>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/data.json");
			try {
				List<Doador> doadores = mapper.readValue(inputStream, typeReference);
				List<Doador> doadoresIsNull = repository.findAll();
				if(doadoresIsNull.isEmpty()) {
					doadorService.createFromJson(doadores);
					System.out.println("Doadores salvos no banco");
				}else {
					System.out.println("Arquivo já foi salvo no banco");
				}
			} catch (Exception e) {
				System.out.println("Não foi possível salvar os doadores no banco de dados " + e.getMessage());
			}
		};
	}
	

}
