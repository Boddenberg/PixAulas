package br.com.boddenberg.pixproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.boddenberg.pixproject.entity.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String>{

}
