package br.com.boddenberg.pixproject.response;

import java.util.List;
import java.util.Optional;

import br.com.boddenberg.pixproject.entity.Client;

//O generic T faz ela poder retornar qualquer tipo de coisa.
public class Response<T> {

	private T data;
	private List<String> erros;
	
	public Response(T data) {
		this.data = data;
	}
	
	public Response(List<String> erros) {
		this.erros = erros;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}
	
	
}
