package com.bancodigital.helio;

import java.util.List;

import lombok.Data;

@Data
public class Banco {

	private String nome;
	private List<Conta> contas;

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
