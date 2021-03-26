package com.testewk.doadores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testewk.doadores.entity.DoadoresView;
import com.testewk.doadores.service.DoadoresViewServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class DoadoresViewController {

	@Autowired
	private DoadoresViewServiceImpl serviceImpl;

	@GetMapping
	public List<DoadoresView> getAllDoadores() {
		return serviceImpl.getAll();
	}

	@GetMapping("/{id}")
	public DoadoresView getDoadoresById(@PathVariable Long id) {
		return serviceImpl.getById(id);
	}

	@GetMapping("/estado/{estado}")
	public Object getDoadorEstado(@PathVariable String estado) {
		return serviceImpl.findDoadorByEstado(estado);
	}

	@GetMapping("/faixa1")
	public double getAvgImcIdade1120() {
		return serviceImpl.getAvgImcByIdadeBetween11_20();
	}

	@GetMapping("/faixa2")
	public double getAvgImcIdade2130() {
		return serviceImpl.getAvgImcByIdadeBetween21_30();
	}

	@GetMapping("/faixa3")
	public double getAvgImcIdade3140() {
		return serviceImpl.getAvgImcByIdadeBetween31_40();
	}

	@GetMapping("/faixa4")
	public double getAvgImcIdade4150() {
		return serviceImpl.getAvgImcByIdadeBetween41_50();
	}

	@GetMapping("/faixa5")
	public double getAvgImcIdade5160() {
		return serviceImpl.getAvgImcByIdadeBetween51_60();
	}

	@GetMapping("/faixa6")
	public double getAvgImcIdade6170() {
		return serviceImpl.getAvgImcByIdadeBetween61_70();

	}

	@GetMapping("/faixa7")
	public double getAvgImcIdade7180() {
		return serviceImpl.getAvgImcByIdadeBetween71_80();
	}

	@GetMapping("/obesidade/homens")
	public double getPercentualHomensObesos() {
		return serviceImpl.getPercentualHomensObesosBySexo();
	}

	@GetMapping("/obesidade/mulheres")
	public double getPercentualMulheresObesas() {
		return serviceImpl.getPercentualMulheresObesosBySexo();
	}

	@GetMapping("/doadorapos")
	public double getQtdDoadoresAPos() {
		return serviceImpl.getQtdDoadoresByTipoSanguineoAPos();
	}

	@GetMapping("/doadoraneg")
	public double getQtdDoadoresANeg() {
		return serviceImpl.getQtdDoadoresByTipoSanguineoANeg();
	}

	@GetMapping("/doadorbpos")
	public double getQtdDoadoresBPos() {
		return serviceImpl.getQtdDoadoresByTipoSanguineoBPos();
	}

	@GetMapping("/doadorbneg")
	public double getQtdDoadoresBNeg() {
		return serviceImpl.getQtdDoadoresByTipoSanguineoBNeg();
	}

	@GetMapping("/doadorabpos")
	public double getQtdDoadoresABPos() {
		return serviceImpl.getQtdDoadoresByTipoSanguineoABPos();
	}

	@GetMapping("/doadorabneg")
	public double getQtdDoadoresABNeg() {
		return serviceImpl.getQtdDoadoresByTipoSanguineoABNeg();
	}

	@GetMapping("/doadoropos")
	public double getQtdDoadoresOPos() {
		return serviceImpl.getQtdDoadoresByTipoSanguineoOPos();
	}

	@GetMapping("/doadoroneg")
	public double getQtdDoadoresONeg() {
		return serviceImpl.getQtdDoadoresByTipoSanguineoONeg();
	}

	@GetMapping("/avgidadeapos")
	public double getAvgIdadeByTipoSanguineoAPos() {
		return serviceImpl.getAvgIdadeByTipoSanguineoAPos();
	}

	@GetMapping("/avgidadeaneg")
	public double getAvgIdadeByTipoSanguineoANeg() {
		return serviceImpl.getAvgIdadeByTipoSanguineoANeg();
	}

	@GetMapping("/avgidadebpos")
	public double getAvgIdadeByTipoSanguineoBPos() {
		return serviceImpl.getAvgIdadeByTipoSanguineoBPos();
	}

	@GetMapping("/avgidadebneg")
	public double getAvgIdadeByTipoSanguineoBNeg() {
		return serviceImpl.getAvgIdadeByTipoSanguineoBNeg();
	}

	@GetMapping("/avgidadeabpos")
	public double getAvgIdadeByTipoSanguineoABPos() {
		return serviceImpl.getAvgIdadeByTipoSanguineoABPos();
	}

	@GetMapping("/avgidadeabneg")
	public double getAvgIdadeByTipoSanguineoABNeg() {
		return serviceImpl.getAvgIdadeByTipoSanguineoABNeg();
	}

	@GetMapping("/avgidadeopos")
	public double getAvgIdadeByTipoSanguineoOPos() {
		return serviceImpl.getAvgIdadeByTipoSanguineoOPos();
	}

	@GetMapping("/avgidadeoneg")
	public double getAvgIdadeByTipoSanguineoONeg() {
		return serviceImpl.getAvgIdadeByTipoSanguineoONeg();
	}

}
