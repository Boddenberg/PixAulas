package br.com.boddenberg.pixproject.service;

import java.util.List;

import br.com.boddenberg.pixproject.entity.PhoneNumberKey;

public interface PhoneNumberKeyService {

	List<PhoneNumberKey> listarTodos();

	PhoneNumberKey cadastrar(PhoneNumberKey phoneNumberKey);

	PhoneNumberKey atualizar(PhoneNumberKey phoneNumberKey);

	void remover(String id);
}
