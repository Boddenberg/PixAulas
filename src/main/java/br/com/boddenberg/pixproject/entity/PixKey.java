package br.com.boddenberg.pixproject.entity;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PixKey {

	@Email(message = "Email inválido!")
	private String email;
	
	@Pattern(regexp = "[\\d]{2,3}[\\d]{4,5}[\\d]{5}", message = "Telefone inválido")
	private String phone;
	
	@CPF(message = "CPF Inválido")
	@Pattern(regexp = "[\\d]{1,3}\\.[\\d]{3}\\.[\\d]{3}\\-[\\dd]{2}", message = "CPF Inválido")
	private String CPF;
	
	@CNPJ
	private String CNPJ;
	
	private String randomKey;
	
}
