package com.adjafsaobraz.ebdapp.classes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adjafsaobraz.ebdapp.classes.entidades.Aluno;

@Repository
public interface AlunoRepositorio extends CrudRepository<Aluno, Integer> {

	
	@Query(value = "select * from classes.tb_aluno")
	public List<Aluno> listarTodos();
	
}
