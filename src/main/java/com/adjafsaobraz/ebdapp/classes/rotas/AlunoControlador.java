package com.adjafsaobraz.ebdapp.classes.rotas;

import java.util.List;

import javax.servlet.annotation.HttpMethodConstraint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adjafsaobraz.ebdapp.classes.entidades.Aluno;
import com.adjafsaobraz.ebdapp.classes.servicos.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoControlador {

	@Autowired
	private AlunoService service;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@DeleteMapping("/{id}")
	public void buscarTodos(@PathVariable Integer id){
		service.DeletarPorId(id);
	}
	@PostMapping
	public ResponseEntity<Aluno> adicionarAluno(@RequestBody Aluno aluno){
		return ResponseEntity.status(201).body(service.inserirAluno(aluno));
	}
	@PutMapping
	public ResponseEntity<Aluno> modificarAluno(@RequestBody Aluno aluno){
		return ResponseEntity.ok(service.modificarAluno(aluno));
	}
	
}


