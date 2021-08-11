package com.adjafsaobraz.ebdapp.classes.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_chamada", schema = "classes")
public class Chamada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_chamada")
	private Integer idChamada;
	@Column(name = "cd_aula")
	private Integer cdAula;
	@Column(name = "in_presente")
	private Boolean inPresente;
	@Column(name = "cd_aluno")
	private Integer cdAluno;
	public Integer getIdChamada() {
		return idChamada;
	}
	public void setIdChamada(Integer idChamada) {
		this.idChamada = idChamada;
	}
	public Integer getCdAula() {
		return cdAula;
	}
	public void setCdAula(Integer cdAula) {
		this.cdAula = cdAula;
	}
	public Boolean getInPresente() {
		return inPresente;
	}
	public void setInPresente(Boolean inPresente) {
		this.inPresente = inPresente;
	}
	public Integer getCdAluno() {
		return cdAluno;
	}
	public void setCdAluno(Integer cdAluno) {
		this.cdAluno = cdAluno;
	}

	

	
	
	

}
