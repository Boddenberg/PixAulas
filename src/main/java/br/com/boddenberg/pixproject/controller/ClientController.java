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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.boddenberg.pixproject.entity.Client;
import br.com.boddenberg.pixproject.response.Response;
import br.com.boddenberg.pixproject.service.ClientServiceAtualizado;

@RestController
@RequestMapping(path = "client/pix")
public class ClientController {


	
		@Autowired
		ClientServiceAtualizado service;
		
		@GetMapping
		public ResponseEntity<Response<List<Client>>> listarTodos() {
			return ResponseEntity.ok(new Response<List<Client>>(this.service.listarTodos()));
			}
	
//
//		@PostMapping
//		public ResponseEntity<Response<Client>> cadastrar(@Valid @RequestBody Client client, BindingResult result){
//			if (result.hasErrors()) {
//				List<String> erros = new ArrayList<String>();
//				result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
//				return ResponseEntity.badRequest().body(new Response<Client>(erros));
//			}
//		return ResponseEntity.ok(new Response<Client>(this.service.cadastrar(client)));
//		}
//			
//		
//		@PutMapping("Update")
//		public ResponseEntity<Response<Client>> atualizar(@PathVariable(name = "id") String id, @Valid @RequestBody Client client, BindingResult result) {
//			if (result.hasErrors()) {
//				List<String> erros = new ArrayList<String>();
//				result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
//				return ResponseEntity.badRequest().body(new Response<Client>(erros));
//			}
//			
//			client.setId(id);
//			return ResponseEntity.ok(new Response<Client>(this.service.atualizar(client)));
//		}
//		
//
//		@DeleteMapping(path = "/{id}")
//	    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id){
//	        this.service.remover(id);
//	        return ResponseEntity.ok(new Response<Integer>(1));
//	    }
//		
//
//		
//		
	}

	

