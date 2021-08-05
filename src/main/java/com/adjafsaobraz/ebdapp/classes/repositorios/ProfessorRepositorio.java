package com.adjafsaobraz.ebdapp.classes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adjafsaobraz.ebdapp.classes.entidades.Professor;

@Repository
public interface ProfessorRepositorio extends CrudRepository<Professor, Integer> {

	
	@Query(value = "select * from classes.tb_professor", nativeQuery = true)
	public List<Professor> listarTodos();
	
}