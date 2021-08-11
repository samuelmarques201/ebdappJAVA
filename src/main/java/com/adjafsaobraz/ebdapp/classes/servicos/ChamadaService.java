package com.adjafsaobraz.ebdapp.classes.servicos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adjafsaobraz.ebdapp.classes.entidades.Chamada;
import com.adjafsaobraz.ebdapp.classes.repositorios.ChamadaRepositorio;

@Service
public class ChamadaService {

	@Autowired
	private ChamadaRepositorio repositorio;
	
	
	
	public List<Chamada> realizarChamada(List<Chamada> alunos) {
		List<Chamada> retorno = new ArrayList<Chamada>();
		alunos.forEach(aluno -> {
		retorno.add(repositorio.save(aluno));
		});
		
		return retorno;
	}
	
	public List<Chamada> verChamada(){
		return repositorio.listarTodos();
	}
	
	
	
}
