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

import com.adjafsaobraz.ebdapp.classes.entidades.Sala;
import com.adjafsaobraz.ebdapp.classes.servicos.SalaServices;

import projecoes.ComboSalaAlunos;

@RestController
@RequestMapping("/salas")
public class SalaControlador {

	@Autowired
	private SalaServices service;
	
	@GetMapping
	public ResponseEntity<List<Sala>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@GetMapping("alunos")
	public ResponseEntity<List<ComboSalaAlunos>> consultarSalaAlunos(){
		return ResponseEntity.ok(service.consultar(null));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Sala> DeletarPorId(@PathVariable Integer id){
		return ResponseEntity.ok(service.procurarPorId(id));
	}
	
	@DeleteMapping("/{id}")
	public void buscarTodos(@PathVariable Integer id){
		service.DeletarPorId(id);
	}
	
	
	
	@PostMapping
	public ResponseEntity<Sala> adicionarAluno(@RequestBody Sala sala){
		System.out.println(sala.getDsNome());
		return ResponseEntity.status(201).body(service.inserirAluno(sala));
	}
	@PutMapping
	public ResponseEntity<Sala> modificarAluno(@RequestBody Sala aula){
		return ResponseEntity.ok(service.modificarAluno(aula));
	}
	
}


