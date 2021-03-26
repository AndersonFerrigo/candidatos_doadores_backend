package com.testewk.doadores.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table( name = "doadores_view")
public class DoadoresView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	@Column(name = "id")
	private Long id;
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("cpf")
	private String cpf;

	@JsonProperty("rg")
	private String rg;
	
	@JsonProperty("idade")
	private String idade;
	
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
	
	@JsonProperty("IMC")
	private double imc;
	
	@JsonProperty("peso")
	private int peso;
	
	@JsonProperty("tipo_sanguineo")
	private String tipo_sanguineo;

	
	}
