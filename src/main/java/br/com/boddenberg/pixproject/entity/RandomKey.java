package br.com.boddenberg.pixproject.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Geral")
public class RandomKey {

	@Id
	private String id;
	
	
	private UUID randomKey;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public UUID getRandomKey() {
		return randomKey;
	}


	public void setRandomKey(UUID randomKey) {
		this.randomKey = randomKey;
	}


	public static UUID generate() {
		return UUID.randomUUID();
	}


}
