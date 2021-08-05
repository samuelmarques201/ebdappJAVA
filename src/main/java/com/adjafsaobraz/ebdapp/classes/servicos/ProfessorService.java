package com.adjafsaobraz.ebdapp.classes.servicos;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adjafsaobraz.ebdapp.classes.entidades.Professor;
import com.adjafsaobraz.ebdapp.classes.repositorios.ProfessorRepositorio;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepositorio repositorio;

	public List<Professor> buscarTodos() {
		List<Professor> professores = repositorio.listarTodos();
		return professores;
	}

	public Professor procurarPorId(Integer id) {
		if (this.professorExists(id)) {
			return repositorio.findById(id).get();
		}
		return null;
	}

	public Professor inserirProfessor(Professor professor) {
		return repositorio.save(professor);
	}
	
	public Professor modificarProfessor(Professor professor) {
		return repositorio.save(professor);
	}

	public void DeletarPorId(Integer id) {
		if (this.professorExists(id)) {
			repositorio.deleteById(id);
		}
	}

	private Boolean professorExists(Integer id) {
		Optional<Professor> professor = repositorio.findById(id);
		if (professor.isPresent()) {
			return true;
		}
		return false;
	}
}
