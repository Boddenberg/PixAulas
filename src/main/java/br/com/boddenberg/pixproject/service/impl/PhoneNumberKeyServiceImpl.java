package br.com.boddenberg.pixproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boddenberg.pixproject.entity.CNPJKey;
import br.com.boddenberg.pixproject.entity.PhoneNumberKey;
import br.com.boddenberg.pixproject.repository.PhoneNumberKeyRepository;
import br.com.boddenberg.pixproject.service.PhoneNumberKeyService;

@Service
public class PhoneNumberKeyServiceImpl  implements PhoneNumberKeyService {

	
	@Autowired
	private PhoneNumberKeyRepository phoneNumberKeyRepository;
	
	
	public List<PhoneNumberKey> listarTodos(){
		return this.phoneNumberKeyRepository.findAll();
	}
	
	
	
	public PhoneNumberKey cadastrar(PhoneNumberKey phoneNumberKey) {
		return this.phoneNumberKeyRepository.save(phoneNumberKey);
	}
	
	
	public PhoneNumberKey atualizar(PhoneNumberKey phoneNumberKey) {
		return this.phoneNumberKeyRepository.save(phoneNumberKey);
	}
	
	
	public void remover(String id) { 
		this.phoneNumberKeyRepository.deleteById(id);
	}
	
}