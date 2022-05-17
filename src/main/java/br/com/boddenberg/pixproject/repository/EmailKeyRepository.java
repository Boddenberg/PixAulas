package br.com.boddenberg.pixproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.boddenberg.pixproject.entity.EmailKey;

public interface EmailKeyRepository extends MongoRepository<EmailKey, String> {

}
