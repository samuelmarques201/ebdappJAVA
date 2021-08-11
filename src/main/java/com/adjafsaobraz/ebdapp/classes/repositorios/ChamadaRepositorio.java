package com.adjafsaobraz.ebdapp.classes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adjafsaobraz.ebdapp.classes.entidades.Chamada;

@Repository
public interface ChamadaRepositorio extends CrudRepository<Chamada, Integer> {

	@Query(value = "select * from classes.tb_chamada", nativeQuery = true)
	public List<Chamada> listarTodos();
	
}
