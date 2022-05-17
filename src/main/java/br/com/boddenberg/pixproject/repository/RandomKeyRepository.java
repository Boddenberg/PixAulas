package br.com.boddenberg.pixproject.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.boddenberg.pixproject.entity.RandomKey;

public interface RandomKeyRepository extends MongoRepository<RandomKey, String> {
	
}
