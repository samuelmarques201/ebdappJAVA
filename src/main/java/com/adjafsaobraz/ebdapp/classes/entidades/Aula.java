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
	

}
