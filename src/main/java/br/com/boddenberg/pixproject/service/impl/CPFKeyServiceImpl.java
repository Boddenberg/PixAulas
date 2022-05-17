package br.com.boddenberg.pixproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boddenberg.pixproject.entity.CPFKey;
import br.com.boddenberg.pixproject.repository.CPFKeyRepository;
import br.com.boddenberg.pixproject.service.CPFKeyService;

@Service
public class CPFKeyServiceImpl  implements CPFKeyService {

	
	@Autowired
	private CPFKeyRepository cpfKeyRepository;
	
	
	public List<CPFKey> listarTodos(){
		return this.cpfKeyRepository.findAll();
	}
	
	
	public CPFKey cadastrar(CPFKey cpfKey) {
		System.out.println("Cheguei aqui");
//		CPFKey cpf = cpfKeyRepository.findByCpf(cpf);
		CPFKey cpf = cpfKeyRepository.findByCpf(cpfKey.getCpf());
		System.out.println(cpf);
		System.out.println(cpfKey);
		return this.cpfKeyRepository.save(cpfKey);
	}
	
	
	public CPFKey atualizar(CPFKey cpfKey) {
		return this.cpfKeyRepository.save(cpfKey);
	}
	
	
	public void remover(String id) { 
		this.cpfKeyRepository.deleteById(id);
	}


//	@Override
//	public CPFKey partialUpdate(CPFKey cpfKey) {
//		return this.cpfKeyRepository.save(cpfKey);
//	}
	
	public void save(CPFKey partialUpdate, String id) {}
	
	
	
}