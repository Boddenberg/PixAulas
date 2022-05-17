package br.com.boddenberg.pixproject.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boddenberg.pixproject.entity.RandomKey;
import br.com.boddenberg.pixproject.repository.RandomKeyRepository;
import br.com.boddenberg.pixproject.service.RandomKeyService;

@Service
public class RandomKeyServiceImpl implements RandomKeyService {

	
	
	@Autowired
	private RandomKeyRepository randomKeyRepository;
	
	
	public List<RandomKey> listarTodos(){
		return this.randomKeyRepository.findAll();
	}
	
	
	public UUID generate(RandomKey randomKey) {
		return UUID.randomUUID();		
	}
	
	
	public RandomKey cadastrar(RandomKey randomKey) {
		return this.randomKeyRepository.save(randomKey);
	}
	
	
	public RandomKey atualizar(RandomKey randomKey) {
		return this.randomKeyRepository.save(randomKey);
	}
	
	
	public void remover(String id) { 
		this.randomKeyRepository.deleteById(id);
	}
	
//	
//	<dependency>
//	<groupId>org.springframework.boot</groupId>
//	<artifactId>spring-boot-starter-security</artifactId>
//</dependency>
	
}