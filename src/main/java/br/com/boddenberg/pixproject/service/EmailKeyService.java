package br.com.boddenberg.pixproject.service;

import java.util.List;

import br.com.boddenberg.pixproject.entity.EmailKey;

public interface EmailKeyService {

	List<EmailKey> listarTodos();

	EmailKey cadastrar(EmailKey emailKey);

	EmailKey atualizar(EmailKey emailKey);

	void remover(String id);
}
