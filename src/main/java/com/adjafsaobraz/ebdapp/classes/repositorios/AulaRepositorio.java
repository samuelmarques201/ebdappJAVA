package com.adjafsaobraz.ebdapp.classes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adjafsaobraz.ebdapp.classes.entidades.Aula;

@Repository
public interface AulaRepositorio extends CrudRepository<Aula, Integer> {

	
	@Query(value = "select * from classes.tb_aula", nativeQuery = true)
	public List<Aula> listarTodos();
	
}
