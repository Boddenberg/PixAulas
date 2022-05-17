package br.com.boddenberg.pixproject.entity;

import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Geral")
public class PhoneNumberKey {

	@Id
	private String id;
	
	@Pattern(regexp = "[\\d]{2,3}[\\d]{4,5}[\\d]{5}", message = "Telefone inválido")
	private String phoneNumber;

	
}
