package br.com.boddenberg.pixproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boddenberg.pixproject.entity.Client;
import br.com.boddenberg.pixproject.repository.ClientRepository;
import br.com.boddenberg.pixproject.service.ClientServiceAtualizado;


@Service
public class ClientServiceImpl implements ClientServiceAtualizado {

	
	@Autowired
	private ClientRepository clientRepository;
	
	
	public List<Client> listarTodos(){
		return this.clientRepository.findAll();
	}
	
	
//	
//	public Client cadastrar(Client client) {
//		return this.clientRepository.save(client);
//	}
//	
//	
//	public Client atualizar(Client client) {
//		return this.clientRepository.save(client);
//	}
//	
//	
//	public void remover(String id) { 
//		this.clientRepository.deleteById(id);
//	}
	
}
