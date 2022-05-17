package br.com.boddenberg.pixproject.entity;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Geral")
public class EmailKey {

	@Id
	private String id;
	
	@Email(message = "Email inválido!")
	private String email;
	
}
