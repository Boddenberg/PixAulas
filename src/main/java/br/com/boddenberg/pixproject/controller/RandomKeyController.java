package br.com.boddenberg.pixproject.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

import br.com.boddenberg.pixproject.entity.RandomKey;
import br.com.boddenberg.pixproject.repository.RandomKeyRepository;
import br.com.boddenberg.pixproject.response.Response;
import br.com.boddenberg.pixproject.service.RandomKeyService;

@RestController
@RequestMapping(path = "phonenumber/pix")
public class RandomKeyController {

	@Autowired
	RandomKeyService service;
	
	@Autowired
	RandomKeyRepository repository;
	

	@GetMapping(path = "randomKey/buscar")
	public ResponseEntity<Response<List<RandomKey>>> listarTodos() {
		return ResponseEntity.ok(new Response<List<RandomKey>>(this.service.listarTodos()));
	}

//	@PostMapping(path = "randomKeyy/cadastrar")
//	public RandomKey criar(@RequestBody RandomKey randomKey) {
//		this.randomKey = UUID.randomUUID();
//		return this.service.cadastrar(randomKey);
//	}
		
	@GetMapping("/uuid")
	public ResponseEntity<UUID> generate() {
		return ResponseEntity.ok(RandomKey.generate());
	}
	
//	@PostMapping(path = "randomKey3/cadastrar")
//	public ResponseEntity<RandomKeyDTO> UUID(@RequestBody RandomKey randomKey){
//		return ResponseEntity.ok(
//				RandomKeyDTO.builder().build());
//	}
//	
	
	@PostMapping(path = "randomKey2/cadastrar")
	public ResponseEntity<Response<RandomKey>> cadastrar(@RequestBody RandomKey randomKey,
			BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<RandomKey>(erros));
		}
		return ResponseEntity.ok(new Response<RandomKey>(this.service.cadastrar(randomKey)));
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
	@PutMapping(path = "randomKey/atualizar/{id}")
	public ResponseEntity<RandomKey> atualizar(@PathVariable(name = "id") String id,
			@RequestBody RandomKey randomKey) {
		randomKey.setId(id);
		return ResponseEntity.ok(this.service.atualizar(randomKey));
	}

	@DeleteMapping(path = "randomKey/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id) {
		this.service.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}

}
