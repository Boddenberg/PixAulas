package br.com.boddenberg.pixproject.entity;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Geral")
public class CNPJKey {

	@Id
	private String id;
	
	@Indexed(unique = true)
	@CNPJ(message = "CNPJ inválido")
	@Pattern(regexp = "[\\d]{2}\\.[\\d]{3}\\.[\\d]{3}\\/[\\d]{4}\\-[\\d]{2}", message = "CNPJ inválido")
	private String CNPJ;


	
}
