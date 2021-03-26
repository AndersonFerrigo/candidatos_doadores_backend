package com.testewk.doadores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.testewk.doadores.entity.DoadoresView;

@Repository
public interface DoadoresViewRepository extends JpaRepository<DoadoresView, Long>{
	
	
	@Query(value = "select * from doadores_view where id=?",
			nativeQuery = true)
	DoadoresView findDoadoresById(Long id);
			
	@Query(value = "select * from doadores_view",
	nativeQuery = true)
	List<DoadoresView> findAllDoadores();
	
	@Query(value ="select count(estado) from doadores_view group by estado where estado = ?",
			nativeQuery = true)
			Object findDoadorByEstado(String estado);
	
		
	@Query(value = "select round(avg(IMC),2) as media_imc_entre_11_e_20 from doadores_view where idade between 11 and 20" 
			, nativeQuery = true)
	double findAvgImcByIdadeBetween11And20();
	
	@Query(value = "select round(avg(IMC),2) as media_imc_entre_21_e_30 from doadores_view where idade between 21 and 30" 
			, nativeQuery = true)
	double findAvgImcByIdadeBetween21And30();
	
	@Query(value = "select round(avg(IMC),2) as media_imc_entre_31_e_40 from doadores_view where idade between 31 and 40" 
			, nativeQuery = true)
	double findAvgImcByIdadeBetween31And40();
	
	@Query(value = "select round(avg(IMC),2) as media_imc_entre_41_e_50 from doadores_view where idade between 41 and 50" 
			, nativeQuery = true)
	double findAvgImcByIdadeBetween41And50();
	
	@Query(value = "select round(avg(IMC),2) as media_imc_entre_51_e_60 from doadores_view where idade between 51 and 60" 
			, nativeQuery = true)
	double findAvgImcByIdadeBetween51And60();
	
	@Query(value = "select round(avg(IMC),2) as media_imc_entre_61_e_70 from doadores_view where idade between 61 and 70" 
			, nativeQuery = true)
	double findAvgImcByIdadeBetween61And70();
	
	@Query(value = "select round(avg(IMC),2) as media_imc_entre_71_e_80 from doadores_view where idade between 71 and 80" 
			, nativeQuery = true)
	double findAvgImcByIdadeBetween71And80();
	
	@Query(
			value ="select round(((select count(sexo) from doadores_view where IMC > 30 and sexo=\"Masculino\") / (select count(sexo) from doadores_view where sexo=\"Masculino\") *100),2) "
					+ "as `percentual_de_homens_obesos`;", 
		    nativeQuery = true)
	double findPercentHomensObesosBySexo();
	
	@Query(
		value ="select round(((select count(sexo) from doadores_view where IMC > 30 and sexo=\"Feminino\") / (select count(sexo) from doadores_view where sexo=\"Feminino\") *100),2) "
				+ "as `percentual_de_mulheres_obesas`;", 
	    nativeQuery = true)
	double findPercentMulheresObesosBySexo();
		
	@Query(
		value ="select count(tipo_sanguineo) as `qtd_possíveis_doadores_A+` from doadores_view where tipo_sanguineo = \"A+\" or tipo_sanguineo = \"A-\" or tipo_sanguineo = \"O+\" or tipo_sanguineo = \"O-\";", 
	    nativeQuery = true)
	int findQtdDoadoresByTipoSanguineoAPos();

	@Query(
		value ="select count(tipo_sanguineo) as `qtd_possíveis_doadores_A-` from doadores_view where tipo_sanguineo = \"A-\" or tipo_sanguineo = \"O-\";", 
	    nativeQuery = true)
	int findQtdDoadoresByTipoSanguineoANeg();

	@Query(
		value ="select count(tipo_sanguineo) as `qtd_possíveis_doadores_B+` from doadores_view where tipo_sanguineo = \"B+\" or tipo_sanguineo = \"B-\" or tipo_sanguineo = \"O+\" or tipo_sanguineo = \"O-\";", 
	    nativeQuery = true)
	int findQtdDoadoresByTipoSanguineoBPos();

	@Query(
		value ="select count(tipo_sanguineo) as `qtd_possíveis_doadores_B-` from doadores_view where tipo_sanguineo = \"B-\" or tipo_sanguineo = \"O-\";", 
	    nativeQuery = true)
	int findQtdDoadoresByTipoSanguineoBNeg();

	@Query(
		value ="select count(tipo_sanguineo) as `qtd_possíveis_doadores_AB+` from doadores_view;", 
	    nativeQuery = true)
	int findQtdDoadoresByTipoSanguineoABPos();

	@Query(
		value ="select count(tipo_sanguineo) as `qtd_possíveis_doadores_AB-` from doadores_view where tipo_sanguineo = \"A-\" or tipo_sanguineo = \"B-\" or	tipo_sanguineo = \"O-\" or tipo_sanguineo = \"AB-\";",
	    nativeQuery = true)
	int findQtdDoadoresByTipoSanguineoABNeg();


	@Query(
		value ="select count(tipo_sanguineo) as `qtd_possíveis_doadores_O+` from doadores_view where tipo_sanguineo = \"O+\" or tipo_sanguineo = \"O-\";",
	    nativeQuery = true)
	int findQtdDoadoresByTipoSanguineoOPos();

	@Query(
		value ="select count(tipo_sanguineo) as `qtd_possíveis_doadores_O-` from doadores_view where tipo_sanguineo = \"O-\";",
	    nativeQuery = true)
	int findQtdDoadoresByTipoSanguineoONeg();
	
	@Query(
		value ="select round(avg(idade),2) as media_de_idade from doadores_view where tipo_sanguineo = \"A+\";",
	    nativeQuery = true)
	double findAvgIdadeDoadoresByTipoSanguineoAPos();

	@Query(
		value ="select round(avg(idade),2) as media_de_idade from doadores_view where tipo_sanguineo = \"A-\";",
	    nativeQuery = true)
	double findAvgIdadeDoadoresByTipoSanguineoANeg();

	@Query(
		value ="select round(avg(idade),2) as media_de_idade from doadores_view where tipo_sanguineo = \"B+\";",
	    nativeQuery = true)
	double findAvgIdadeDoadoresByTipoSanguineoBPos();

	@Query(
		value ="select round(avg(idade),2) as media_de_idade from doadores_view where tipo_sanguineo = \"B-\";",
	    nativeQuery = true)
	double findAvgIdadeDoadoresByTipoSanguineoBNeg();

	@Query(
		value ="select round(avg(idade),2) as media_de_idade from doadores_view where tipo_sanguineo = \"AB+\";",
	    nativeQuery = true)
	double findAvgIdadeDoadoresByTipoSanguineoABPos();

	@Query(
		value ="select round(avg(idade),2) as media_de_idade from doadores_view where tipo_sanguineo = \"AB-\";",
	    nativeQuery = true)
	double findAvgIdadeDoadoresByTipoSanguineoABNeg();

	@Query(
		value ="select round(avg(idade),2) as media_de_idade from doadores_view where tipo_sanguineo = \"O+\";",
	    nativeQuery = true)
	double findAvgIdadeDoadoresByTipoSanguineoOPos();

	@Query(
		value ="select round(avg(idade),2) as media_de_idade from doadores_view where tipo_sanguineo = \"O-\";",
	    nativeQuery = true)
	double findAvgIdadeDoadoresByTipoSanguineoONeg();
	
}
