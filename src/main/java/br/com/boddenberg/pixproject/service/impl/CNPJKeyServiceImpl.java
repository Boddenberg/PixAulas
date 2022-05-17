package br.com.boddenberg.pixproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boddenberg.pixproject.entity.CNPJKey;
import br.com.boddenberg.pixproject.entity.Client;
import br.com.boddenberg.pixproject.repository.CNPJKeyRepository;
import br.com.boddenberg.pixproject.service.CNPJKeyService;

@Service
public class CNPJKeyServiceImpl implements CNPJKeyService {

	
	@Autowired
	private CNPJKeyRepository cnpjKeyRepository;
	
	
	public List<CNPJKey> listarTodos(){
		return this.cnpjKeyRepository.findAll();
	}
	
	
	
	public CNPJKey cadastrar(CNPJKey cnpjKey) {
		return this.cnpjKeyRepository.save(cnpjKey);
	}
	
	
	public CNPJKey atualizar(CNPJKey cnpjKey) {
		return this.cnpjKeyRepository.save(cnpjKey);
	}
	
	
	public void remover(String id) { 
		this.cnpjKeyRepository.deleteById(id);
	}
	
}