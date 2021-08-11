package com.adjafsaobraz.ebdapp.classes.servicos;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adjafsaobraz.ebdapp.classes.entidades.Aula;
import com.adjafsaobraz.ebdapp.classes.repositorios.AulaRepositorio;

@Service
public class AulaService {

	@Autowired
	private AulaRepositorio repositorio;

	public List<Aula> buscarTodos() {
		List<Aula> aulas = repositorio.listarTodos();
		return aulas;
	}

	public Aula procurarPorId(Integer id) {
		if (this.alunoExists(id)) {
			return repositorio.findById(id).get();
		}
		return null;
	}

	public Aula inserirAluno(Aula aula) {
		aula.setDtData(new Date());
		return repositorio.save(aula);
	}
	
	public Aula modificarAluno(Aula aula) {
		return repositorio.save(aula);
	}

	public void DeletarPorId(Integer id) {
		if (this.alunoExists(id)) {
			repositorio.deleteById(id);
		}
	}

	private Boolean alunoExists(Integer id) {
		Optional<Aula> aluno = repositorio.findById(id);
		if (aluno.isPresent()) {
			return true;
		}
		return false;
	}
}
