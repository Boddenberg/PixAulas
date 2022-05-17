package br.com.boddenberg.pixproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.boddenberg.pixproject.entity.CNPJKey;

@Repository
public interface CNPJKeyRepository extends MongoRepository<CNPJKey, String>{

}
