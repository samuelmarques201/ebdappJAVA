package com.adjafsaobraz.ebdapp.classes.servicos;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adjafsaobraz.ebdapp.classes.entidades.Aluno;
import com.adjafsaobraz.ebdapp.classes.repositorios.AlunoRepositorio;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepositorio repositorio;

	public List<Aluno> buscarTodos() {
		List<Aluno> alunos = repositorio.listarTodos();
		return alunos;
	}

	public Aluno procurarPorId(Integer id) {
		if (this.alunoExists(id)) {
			return repositorio.findById(id).get();
		}
		return null;
	}

	public Aluno inserirAluno(Aluno aluno) {
		return repositorio.save(aluno);
	}
	
	public Aluno modificarAluno(Aluno aluno) {
		return repositorio.save(aluno);
	}

	public void DeletarPorId(Integer id) {
		if (this.alunoExists(id)) {
			repositorio.deleteById(id);
		}
	}

	private Boolean alunoExists(Integer id) {
		Optional<Aluno> aluno = repositorio.findById(id);
		if (aluno.isPresent()) {
			return true;
		}
		return false;
	}
}
