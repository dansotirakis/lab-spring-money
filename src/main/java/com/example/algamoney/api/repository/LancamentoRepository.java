package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Lancamento;

/* 
 *	@author Damianos Sotirakis
 * 
 * 	Interface criada para implementação dos métodos de persistencia rest do objeto lancamento
 * 
 * */

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
