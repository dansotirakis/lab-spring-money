package com.example.algamoney.api.repository.lancamento;

import java.util.List;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.LancamentoRepository;
import com.example.algamoney.api.repository.filter.LancamentoFilter;

/* 
 *	@author Damianos Sotirakis
 * 
 * 	Interface criada para utilização de regras para rest do objeto lancamento
 * 
 * */

public interface LancamentoRepositoryQuery extends LancamentoRepository {

	public List <Lancamento> filtrar (LancamentoFilter lancamentoFilter);

}
