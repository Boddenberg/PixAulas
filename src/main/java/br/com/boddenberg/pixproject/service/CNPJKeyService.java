package br.com.boddenberg.pixproject.service;

import java.util.List;

import br.com.boddenberg.pixproject.entity.CNPJKey;

public interface CNPJKeyService {

	List<CNPJKey> listarTodos();

	CNPJKey cadastrar(CNPJKey cnpjKey);

	CNPJKey atualizar(CNPJKey cnpjKey);

	void remover(String id);
}
