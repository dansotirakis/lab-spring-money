package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Categoria;

/* 
 *	@author Damianos Sotirakis
 * 
 * 	Interface criada para implementação dos métodos de persistencia rest do objeto categoria
 * 
 * */

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
