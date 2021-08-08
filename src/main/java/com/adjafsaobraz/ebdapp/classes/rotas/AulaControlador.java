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

import com.adjafsaobraz.ebdapp.classes.entidades.Aula;
import com.adjafsaobraz.ebdapp.classes.servicos.AulaService;

@RestController
@RequestMapping("/aulas")
public class AulaControlador {

	@Autowired
	private AulaService service;
	
	@GetMapping
	public ResponseEntity<List<Aula>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aula> DeletarPorId(@PathVariable Integer id){
		return ResponseEntity.ok(service.procurarPorId(id));
	}
	
	@DeleteMapping("/{id}")
	public void buscarTodos(@PathVariable Integer id){
		service.DeletarPorId(id);
	}
	@PostMapping
	public ResponseEntity<Aula> adicionarAluno(@RequestBody Aula aula){
		return ResponseEntity.status(201).body(service.inserirAluno(aula));
	}
	@PutMapping
	public ResponseEntity<Aula> modificarAluno(@RequestBody Aula aula){
		return ResponseEntity.ok(service.modificarAluno(aula));
	}
	
}


