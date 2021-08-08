package com.adjafsaobraz.ebdapp.classes.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aula", schema = "classes")
public class Aula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aula")
	private Integer IdAula;
	@Column(name = "ds_nome")
	private String dsNome;
	@Column(name = "dt_data")
	private Date dtData;
	
	@Column(name = "cd_sala")
	private Integer cdSala;

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

	public Integer getCdSala() {
		return cdSala;
	}

	public void setCdSala(Integer cdSala) {
		this.cdSala = cdSala;
	}
	
	
	

}
