package br.com.boddenberg.pixproject.repository;

import java.awt.print.Book;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.boddenberg.pixproject.entity.CPFKey;

public interface CPFKeyRepository extends MongoRepository<CPFKey, String> {

	@Query(value = "{'cpf': ?0}")
	CPFKey findByCpf(String cpf);
	
}
