package br.com.boddenberg.pixproject.service;

import java.util.List;

import br.com.boddenberg.pixproject.entity.CPFKey;

public interface CPFKeyService {

	List<CPFKey> listarTodos();

	CPFKey cadastrar(CPFKey cpfKey);

	CPFKey atualizar(CPFKey cpfKey);

	void remover(String id);
	
//	CPFKey partialUpdate(CPFKey cpfKey);
	
	
}
