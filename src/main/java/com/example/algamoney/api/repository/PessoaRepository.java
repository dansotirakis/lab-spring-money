package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Pessoa;

/* 
 *	@author Damianos Sotirakis
 * 
 * 	Interface criada para implementação dos métodos de persistencia rest do objeto pessoa
 * 
 * */

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
