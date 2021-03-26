package com.testewk.doadores.service;

import java.util.List;

import com.testewk.doadores.entity.DoadoresView;

public interface DoadoresViewService {
	
	DoadoresView getById(Long id);
	
	List<DoadoresView> getAll();
	Object findDoadorByEstado(String estado);

	double getAvgImcByIdadeBetween11_20();
	double getAvgImcByIdadeBetween21_30();
	double getAvgImcByIdadeBetween31_40();
	double getAvgImcByIdadeBetween41_50();
	double getAvgImcByIdadeBetween51_60();
	double getAvgImcByIdadeBetween61_70();
	double getAvgImcByIdadeBetween71_80();
	
	double getPercentualHomensObesosBySexo();
	double getPercentualMulheresObesosBySexo();

	int getQtdDoadoresByTipoSanguineoAPos();
	int getQtdDoadoresByTipoSanguineoANeg();
	int getQtdDoadoresByTipoSanguineoBPos();
	int getQtdDoadoresByTipoSanguineoBNeg();
	int getQtdDoadoresByTipoSanguineoABPos();
	int getQtdDoadoresByTipoSanguineoABNeg();
	int getQtdDoadoresByTipoSanguineoOPos();
	int getQtdDoadoresByTipoSanguineoONeg();
	
	double getAvgIdadeByTipoSanguineoAPos();
	double getAvgIdadeByTipoSanguineoANeg();
	double getAvgIdadeByTipoSanguineoBPos();
	double getAvgIdadeByTipoSanguineoBNeg();
	double getAvgIdadeByTipoSanguineoABPos();
	double getAvgIdadeByTipoSanguineoABNeg();
	double getAvgIdadeByTipoSanguineoOPos();
	double getAvgIdadeByTipoSanguineoONeg();
	

}
