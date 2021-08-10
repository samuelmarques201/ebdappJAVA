package com.adjafsaobraz.ebdapp.classes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.adjafsaobraz.ebdapp.classes.entidades.Sala;

import projecoes.ComboSalaAlunos;

public interface SalaRepositorio extends CrudRepository<Sala, Integer>{

	@Query(value = "select * from classes.tb_sala", nativeQuery = true)
	public List<Sala> listarTodos();
	
	@Query(value = "select tbs.id_sala as idSala, tbs.ds_nome as dsNomeSala, tba.ds_nome as dsNomeAluno from classes.tb_sala tbs"
			+ " inner join classes.tb_aluno tba on tbs.id_sala = tba.cd_sala"
			+ " where (:dsNome is null or tbs.ds_nome = cast(:dsNome as varchar(20)) )", nativeQuery = true)
	public List<ComboSalaAlunos> consultar(@Param("dsNome") String dsNome);
}
