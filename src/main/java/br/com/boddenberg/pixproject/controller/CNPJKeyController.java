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

import br.com.boddenberg.pixproject.entity.CNPJKey;
import br.com.boddenberg.pixproject.response.Response;
import br.com.boddenberg.pixproject.service.CNPJKeyService;

@RestController
@RequestMapping(path = "cnpj/pix")
public class CNPJKeyController {

	@Autowired
	CNPJKeyService service;

	@GetMapping(path = "cnpj/buscar")
	public ResponseEntity<Response<List<CNPJKey>>> listarTodos() {
		return ResponseEntity.ok(new Response<List<CNPJKey>>(this.service.listarTodos()));
	}

	@PostMapping(path = "cnpj/cadastrar")
	public ResponseEntity<Response<CNPJKey>> cadastrar(@Valid @RequestBody CNPJKey cnpjKey, BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<CNPJKey>(erros));
		}
		return ResponseEntity.ok(new Response<CNPJKey>(this.service.cadastrar(cnpjKey)));
	}

//	@PutMapping(path = "cpf/atualizar")
//	public ResponseEntity<Response<CNPJKey>> atualizar(@PathVariable(name = "id") String id,
//			@Valid @RequestBody CNPJKey cnpjKey, BindingResult result) {
//		if (result.hasErrors()) {
//			List<String> erros = new ArrayList<String>();
//			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
//			return ResponseEntity.badRequest().body(new Response<CNPJKey>(erros));
//		} cnpjKey.setId(id);
//		return ResponseEntity.ok(new Response<CNPJKey>(this.service.atualizar(cnpjKey)));
//	}
	
	@PutMapping(path = "cnpj/atualizar/{id}")
	public ResponseEntity<CNPJKey> atualizar(@PathVariable(name = "id") String id, @RequestBody CNPJKey cnpjKey) {
		cnpjKey.setId(id);
		return ResponseEntity.ok(this.service.atualizar(cnpjKey));
	}


	@DeleteMapping(path = "cpf/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id) {
		this.service.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}

}
