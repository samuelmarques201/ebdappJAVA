package com.adjafsaobraz.ebdapp.classes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.adjafsaobraz.ebdapp.classes.entidades.Sala;

public interface SalaRepositorio extends CrudRepository<Sala, Integer>{

	@Query(value = "select * from classes.tb_sala", nativeQuery = true)
	public List<Sala> listarTodos();
	
	
}
