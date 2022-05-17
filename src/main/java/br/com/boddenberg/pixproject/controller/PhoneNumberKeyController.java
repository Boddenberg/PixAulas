package br.com.boddenberg.pixproject.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.boddenberg.pixproject.entity.CPFKey;
import br.com.boddenberg.pixproject.entity.EmailKey;
import br.com.boddenberg.pixproject.entity.PhoneNumberKey;
import br.com.boddenberg.pixproject.response.Response;
import br.com.boddenberg.pixproject.service.PhoneNumberKeyService;

@RestController
@RequestMapping(path = "phonenumber/pix")
public class PhoneNumberKeyController {

	@Autowired
	PhoneNumberKeyService service;

	@GetMapping(path = "phonenumber/buscar")
	public ResponseEntity<Response<List<PhoneNumberKey>>> listarTodos() {
		return ResponseEntity.ok(new Response<List<PhoneNumberKey>>(this.service.listarTodos()));
	}

	@PostMapping(path = "phonenumber/cadastrar")
	public ResponseEntity<Response<PhoneNumberKey>> cadastrar(@Valid @RequestBody PhoneNumberKey phoneNumberKey,
			BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<PhoneNumberKey>(erros));
		}
		return ResponseEntity.ok(new Response<PhoneNumberKey>(this.service.cadastrar(phoneNumberKey)));
	}

//		@PutMapping(path = "phonenumber/atualizar")
//		public ResponseEntity<Response<PhoneNumberKey>> atualizar(@PathVariable(name = "id") String id, @Valid @RequestBody PhoneNumberKey phoneNumberKey, BindingResult result) {
//			if (result.hasErrors()) {
//				List<String> erros = new ArrayList<String>();
//				result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
//				return ResponseEntity.badRequest().body(new Response<PhoneNumberKey>(erros));
//			}
//			
//			phoneNumberKey.setId(id);
//			return ResponseEntity.ok(new Response<PhoneNumberKey>(this.service.atualizar(phoneNumberKey)));
//		}
//		
	@PutMapping(path = "phonenumber/atualizar/{id}")
	public ResponseEntity<PhoneNumberKey> atualizar(@PathVariable(name = "id") String id,
			@RequestBody PhoneNumberKey phoneNumberKey) {
		phoneNumberKey.setId(id);
		return ResponseEntity.ok(this.service.atualizar(phoneNumberKey));
	}

	@DeleteMapping(path = "phonenumber/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id) {
		this.service.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}

}
