package com.adjafsaobraz.ebdapp.classes.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aluno", schema = "classes")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aluno")
	private Integer idAluno;
	@Column(name = "ds_nome")
	private String dsNome;
	@Column(name = "ds_idade")
	private String dsIdade;

	@Column(name = "ds_contato")
	private String dsContato;

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getDsNome() {
		return dsNome;
	}

	public void setDsNome(String dsNome) {
		this.dsNome = dsNome;
	}

	public String getDsIdade() {
		return dsIdade;
	}

	public void setDsIdade(String dsIdade) {
		this.dsIdade = dsIdade;
	}

	public String getDsContato() {
		return dsContato;
	}

	public void setDsContato(String dsContato) {
		this.dsContato = dsContato;
	}

}
