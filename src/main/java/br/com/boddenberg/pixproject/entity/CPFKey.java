package br.com.boddenberg.pixproject.entity;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Geral")
public class CPFKey {

	@Id
	private String id;
	
	@Indexed(unique = true, background = true)
	@CPF(message = "CPF inválido!")
	@Pattern(regexp = "[\\d]{3}\\.[\\d]{3}\\.[\\d]{3}\\-[\\d]{2}", message = "CPF inválido")
	private String cpf;
	
}
