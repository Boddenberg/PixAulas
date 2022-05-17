package br.com.boddenberg.pixproject.entity;

import java.util.UUID;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "Geral")
public class Client {

	
	@Id
	private String id;
		
	
	@CPF(message = "CPF inválido!")
	private String cpf;
	
	
	@Email(message = "Email inválido!")
	private String email;
	
	@Pattern(regexp = "[\\d]{2,3}[\\d]{4,5}[\\d]{5}", message = "Telefone inválido")
	private String phoneNumber;

	@CNPJ(message = "CNPJ inválido")
	@Pattern(regexp = "[\\d]{2}\\.[\\d]{3}\\.[\\d]{3}\\/[\\d]{4}\\-[\\d]{2}", message = "CNPJ inválido")
	private String CNPJ;
	
	private UUID randomKey;
	
	
}


