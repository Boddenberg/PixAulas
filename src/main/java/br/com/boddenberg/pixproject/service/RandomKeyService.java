package br.com.boddenberg.pixproject.service;

import java.util.List;

import br.com.boddenberg.pixproject.entity.RandomKey;

public interface RandomKeyService {

	List<RandomKey> listarTodos();

	RandomKey cadastrar(RandomKey randomKey);

	RandomKey atualizar(RandomKey randomKey);

	void remover(String id);
	

}
