package br.com.boddenberg.pixproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boddenberg.pixproject.entity.CNPJKey;
import br.com.boddenberg.pixproject.entity.EmailKey;
import br.com.boddenberg.pixproject.repository.EmailKeyRepository;
import br.com.boddenberg.pixproject.service.EmailKeyService;

@Service
public class EmailKeyServiceImpl  implements EmailKeyService {

	
	@Autowired
	private EmailKeyRepository EmailKeyRepository;
	
	
	public List<EmailKey> listarTodos(){
		return this.EmailKeyRepository.findAll();
	}
	
	
	
	public EmailKey cadastrar(EmailKey emailKey) {
		return this.EmailKeyRepository.save(emailKey);
	}
	
	
	public EmailKey atualizar(EmailKey emailKey) {
		return this.EmailKeyRepository.save(emailKey);
	}
	
	
	public void remover(String id) { 
		this.EmailKeyRepository.deleteById(id);
	}
	
}