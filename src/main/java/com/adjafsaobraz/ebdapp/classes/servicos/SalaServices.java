package com.adjafsaobraz.ebdapp.classes.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adjafsaobraz.ebdapp.classes.entidades.Sala;
import com.adjafsaobraz.ebdapp.classes.repositorios.SalaRepositorio;

import projecoes.ComboSalaAlunos;

@Service
public class SalaServices {

	@Autowired
	private SalaRepositorio repositorio;

	public List<Sala> buscarTodos() {
		List<Sala> sala = repositorio.listarTodos();
		return sala;
	}
	
	public List<ComboSalaAlunos> consultar(String dsSala){
		List<ComboSalaAlunos> salaAlunos = repositorio.consultar(null);
		return salaAlunos;
	}

	public Sala procurarPorId(Integer id) {
		if (this.salaExists(id)) {
			return repositorio.findById(id).get();
		}
		return null;
	}

	public Sala inserirAluno(Sala sala) {
		return repositorio.save(sala);
	}
	
	public Sala modificarAluno(Sala aula) {
		return repositorio.save(aula);
	}

	public void DeletarPorId(Integer id) {
		if (this.salaExists(id)) {
			repositorio.deleteById(id);
		}
	}

	private Boolean salaExists(Integer id) {
		Optional<Sala> aluno = repositorio.findById(id);
		if (aluno.isPresent()) {
			return true;
		}
		return false;
	}
}
