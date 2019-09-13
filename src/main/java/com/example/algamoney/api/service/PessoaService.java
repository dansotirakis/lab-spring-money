package com.example.algamoney.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.model.Pessoa;
import com.example.algamoney.api.repository.PessoaRepository;

/* 
 *	@author Damianos Sotirakis
 * 
 * 	Classe criada para implementação das regras de negócio para o objeto pessoa
 * 
 * */

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		Pessoa pessoaSalva = encontrarPessoa(codigo);
		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
		return pessoaRepository.save(pessoaSalva);
		
	}

	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
		Pessoa pessoaSalva = encontrarPessoa(codigo);
		pessoaSalva.setAtivo(ativo);
		pessoaRepository.save(pessoaSalva);		
	}
	
	private Pessoa encontrarPessoa(Long codigo) {
		Pessoa pessoaSalva = pessoaRepository.findOne(codigo);
		if (pessoaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva;
	}
}
