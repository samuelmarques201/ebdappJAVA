package com.adjafsaobraz.ebdapp.classes.rotas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjafsaobraz.ebdapp.classes.entidades.Chamada;
import com.adjafsaobraz.ebdapp.classes.servicos.ChamadaService;

@RestController
@RequestMapping("/chamada")
@Controller
public class ChamadaControllador {

	
	@Autowired
	private ChamadaService service;
	
	@PostMapping
	public ResponseEntity<List<Chamada>> buscarTodos(@RequestBody List<Chamada> listaDeAlunos){
		//listaDeAlunos.forEach(aluno ->{aluno.set});
		return ResponseEntity.ok(service.realizarChamada(listaDeAlunos));
	}
	
	@GetMapping()
	public ResponseEntity<List<Chamada>> consultarChamada(){
		return ResponseEntity.ok(service.verChamada());
	}
}
