package com.adjafsaobraz.ebdapp.classes.rotas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjafsaobraz.ebdapp.classes.entidades.Professor;
import com.adjafsaobraz.ebdapp.classes.servicos.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorControlador {

	@Autowired
	private ProfessorService service;
	
	@GetMapping
	public ResponseEntity<List<Professor>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Professor> DeletarPorId(@PathVariable Integer id){
		return ResponseEntity.ok(service.procurarPorId(id));
	}
	
	@DeleteMapping("/{id}")
	public void buscarTodos(@PathVariable Integer id){
		service.DeletarPorId(id);
	}
	@PostMapping
	public ResponseEntity<Professor> adicionarAluno(@RequestBody Professor professor){
		return ResponseEntity.status(201).body(service.inserirProfessor(professor));
	}
	@PutMapping
	public ResponseEntity<Professor> modificarAluno(@RequestBody Professor professor){
		return ResponseEntity.ok(service.modificarProfessor(professor));
	}
	
}


