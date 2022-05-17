package br.com.boddenberg.pixproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.boddenberg.pixproject.entity.PhoneNumberKey;

public interface PhoneNumberKeyRepository extends MongoRepository<PhoneNumberKey, String> {

}
