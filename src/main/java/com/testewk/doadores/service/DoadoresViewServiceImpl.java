package com.testewk.doadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testewk.doadores.entity.DoadoresView;
import com.testewk.doadores.repository.DoadoresViewRepository;

@Service
public class DoadoresViewServiceImpl implements DoadoresViewService {
	
	@Autowired
	private DoadoresViewRepository repository;
	
	@Override
	public DoadoresView getById(Long id) {
		return (DoadoresView) repository.findDoadoresById(id);
	}
	
	@Override
	public Object findDoadorByEstado(String estado) {
		return repository.findDoadorByEstado(estado);
	}

	@Override
	public List<DoadoresView> getAll() {
		return repository.findAllDoadores();
	}
	
	@Override
	public double getAvgImcByIdadeBetween11_20() {
		return repository.findAvgImcByIdadeBetween11And20();
	}

	@Override
	public double getAvgImcByIdadeBetween21_30() {
		return repository.findAvgImcByIdadeBetween21And30();
	}

	@Override
	public double getAvgImcByIdadeBetween31_40() {
		return repository.findAvgImcByIdadeBetween31And40();
	}

	@Override
	public double getAvgImcByIdadeBetween41_50() {
		return repository.findAvgImcByIdadeBetween41And50();
	}

	@Override
	public double getAvgImcByIdadeBetween51_60() {
		return repository.findAvgImcByIdadeBetween51And60();
	}

	@Override
	public double getAvgImcByIdadeBetween61_70() {
		return repository.findAvgImcByIdadeBetween61And70();
	}

	@Override
	public double getAvgImcByIdadeBetween71_80() {
		return repository.findAvgImcByIdadeBetween71And80();
	}

	@Override
	public double getPercentualHomensObesosBySexo() {
		return repository.findPercentHomensObesosBySexo();
	}

	@Override
	public double getPercentualMulheresObesosBySexo() {
		return repository.findPercentMulheresObesosBySexo();
	}

	@Override
	public int getQtdDoadoresByTipoSanguineoAPos() {
		return repository.findQtdDoadoresByTipoSanguineoAPos();
	}

	@Override
	public int getQtdDoadoresByTipoSanguineoANeg() {
		return repository.findQtdDoadoresByTipoSanguineoANeg();
	}

	@Override
	public int getQtdDoadoresByTipoSanguineoBPos() {
		return repository.findQtdDoadoresByTipoSanguineoBPos();
	}

	@Override
	public int getQtdDoadoresByTipoSanguineoBNeg() {
		return repository.findQtdDoadoresByTipoSanguineoBNeg();
	}

	@Override
	public int getQtdDoadoresByTipoSanguineoABPos() {
		return repository.findQtdDoadoresByTipoSanguineoABPos();
	}

	@Override
	public int getQtdDoadoresByTipoSanguineoABNeg() {
		return repository.findQtdDoadoresByTipoSanguineoABNeg();
	}

	@Override
	public int getQtdDoadoresByTipoSanguineoOPos() {
		return repository.findQtdDoadoresByTipoSanguineoOPos();
	}

	@Override
	public int getQtdDoadoresByTipoSanguineoONeg() {
		return repository.findQtdDoadoresByTipoSanguineoONeg();
	}

	@Override
	public double getAvgIdadeByTipoSanguineoAPos() {
		return repository.findAvgIdadeDoadoresByTipoSanguineoAPos();
	}

	@Override
	public double getAvgIdadeByTipoSanguineoANeg() {
		return repository.findAvgIdadeDoadoresByTipoSanguineoANeg();
	}

	@Override
	public double getAvgIdadeByTipoSanguineoBPos() {
		return repository.findAvgIdadeDoadoresByTipoSanguineoBPos();
	}

	@Override
	public double getAvgIdadeByTipoSanguineoBNeg() {
		return repository.findAvgIdadeDoadoresByTipoSanguineoBNeg();
	}

	@Override
	public double getAvgIdadeByTipoSanguineoABPos() {
		return repository.findAvgIdadeDoadoresByTipoSanguineoABPos();
	}

	@Override
	public double getAvgIdadeByTipoSanguineoABNeg() {
		return repository.findAvgIdadeDoadoresByTipoSanguineoABNeg();
	}

	@Override
	public double getAvgIdadeByTipoSanguineoOPos() {
		return repository.findAvgIdadeDoadoresByTipoSanguineoOPos();
	}

	@Override
	public double getAvgIdadeByTipoSanguineoONeg() {
		return repository.findAvgIdadeDoadoresByTipoSanguineoONeg();
	}
}
