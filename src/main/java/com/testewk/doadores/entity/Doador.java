package com.testewk.doadores.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "doador")
public class Doador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("cpf")
	private String cpf;

	@JsonProperty("rg")
	private String rg;
	
	@JsonProperty("data_nasc")
	private String data_nasc;
	
	@JsonProperty("sexo")
	private String sexo;
	
	@JsonProperty("mae")
	private String mae;
	
	@JsonProperty("pai")
	private String pai;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("cep")
	private String cep;
	
	@JsonProperty("endereco")
	private String endereco;
	
	@JsonProperty("numero")
	private int numero;
	
	@JsonProperty("bairro")
	private String bairro;
	
	@JsonProperty("cidade")
	private String cidade;
	
	@JsonProperty("estado")
	private String estado;
	
	@JsonProperty("telefone_fixo")
	private String telefone_fixo;
	
	@JsonProperty("celular")
	private String celular;    
	
	@JsonProperty("altura")
	private double altura;
	
	@JsonProperty("peso")
	private int peso;
	
	@JsonProperty("tipo_sanguineo")
	private String tipo_sanguineo;

}
