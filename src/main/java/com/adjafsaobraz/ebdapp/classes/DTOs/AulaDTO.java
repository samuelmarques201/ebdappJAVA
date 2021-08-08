package com.adjafsaobraz.ebdapp.classes.DTOs;

import java.util.Date;



public class AulaDTO {

	
	private Integer IdAula;
	private String dsNome;
	private Date dtData;
	
	
	public Integer getIdAula() {
		return IdAula;
	}
	public void setIdAula(Integer idAula) {
		IdAula = idAula;
	}
	public String getDsNome() {
		return dsNome;
	}
	public void setDsNome(String dsNome) {
		this.dsNome = dsNome;
	}
	public Date getDtData() {
		return dtData;
	}
	public void setDtData(Date dtData) {
		this.dtData = dtData;
	}
	
	
	
}
