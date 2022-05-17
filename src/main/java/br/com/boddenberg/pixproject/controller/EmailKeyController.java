package br.com.boddenberg.pixproject.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.boddenberg.pixproject.entity.EmailKey;
import br.com.boddenberg.pixproject.response.Response;
import br.com.boddenberg.pixproject.service.EmailKeyService;

@RestController
@RequestMapping(path = "email/pix")
public class EmailKeyController {


	
		@Autowired
		EmailKeyService service;
		
		@GetMapping(path = "email/buscar")
		public ResponseEntity<Response<List<EmailKey>>> listarTodos() {
			return ResponseEntity.ok(new Response<List<EmailKey>>(this.service.listarTodos()));
			}
	

		@PostMapping(path = "email/cadastrar")
		public ResponseEntity<Response<EmailKey>> cadastrar(@Valid @RequestBody EmailKey emailKey, BindingResult result){
			if (result.hasErrors()) {
				List<String> erros = new ArrayList<String>();
				result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
				return ResponseEntity.badRequest().body(new Response<EmailKey>(erros));
			}
		return ResponseEntity.ok(new Response<EmailKey>(this.service.cadastrar(emailKey)));
		}
			
		
//		@PutMapping(path = "email/atualizar")
//		public ResponseEntity<Response<EmailKey>> atualizar(@PathVariable(name = "id") String id, @Valid @RequestBody EmailKey emailKey, BindingResult result) {
//			if (result.hasErrors()) {
//				List<String> erros = new ArrayList<String>();
//				result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
//				return ResponseEntity.badRequest().body(new Response<EmailKey>(erros));
//			}
//			
//			emailKey.setId(id);
//			return ResponseEntity.ok(new Response<EmailKey>(this.service.atualizar(emailKey)));
//		}
		
		@PatchMapping(path = "emailkey/atualizar/{id}")
		public ResponseEntity<EmailKey> atualizar(@PathVariable(name = "id") String id, @RequestBody EmailKey emailKey) {
			emailKey.setId(id);
			return ResponseEntity.ok(this.service.atualizar(emailKey));
		}


		@DeleteMapping(path = "email/{id}")
	    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id){
	        this.service.remover(id);
	        return ResponseEntity.ok(new Response<Integer>(1));
	    }
		

		
		
	}

	