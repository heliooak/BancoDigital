package com.bancodigital.helio;

import java.util.Scanner;

public class Main {

	public static void menu() {
		
		System.out.println("==== Banco Digital ====");
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar");
		System.out.println("3 - Transferir");
		System.out.println("4 - Extrato");
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Informe seu nome: ");
		String nome = new Scanner(System.in).nextLine();
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome(nome);
		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);
	
		
		int opcao = 1;
		int opcao2;
		Scanner entrada = new Scanner(System.in);
		
		while(opcao != 0) {
			menu();
			opcao = entrada.nextInt();
			Double valor;
			
			switch(opcao) {
			
			case 1:
				System.out.println("=== Saque - Selecione ===");
				System.out.println("1 - Conta Corrente");
				System.out.println("2 - Poupanca");
				opcao2 = entrada.nextInt();
				if(opcao2 == 1) {
					System.out.println("=== Digite o Valor ===");
					valor = Double.parseDouble(new Scanner(System.in).nextLine());
					cc.sacar(valor);
				} else {
					System.out.println("=== Digite o Valor ===");
					valor = Double.parseDouble(new Scanner(System.in).nextLine());
					poupanca.sacar(valor);
				}
				break;
			case 2:
				System.out.println("=== Depósito - Selecione ===");
				System.out.println("1 - Conta Corrente");
				System.out.println("2 - Poupanca");
				opcao2 = entrada.nextInt();
				if(opcao2 == 1) {
					System.out.println("=== Digite o Valor ===");
					valor = Double.parseDouble(new Scanner(System.in).nextLine());
					cc.depositar(valor);
				} else {
					System.out.println("=== Digite o Valor ===");
					valor = Double.parseDouble(new Scanner(System.in).nextLine());
					poupanca.depositar(valor);
				}
				break;
			case 3:
				System.out.println("=== Transferir - Selecione ===");
				System.out.println("1 - De poupanca para Conta Corrente");
				System.out.println("2 - De Conta Corrente para Poupanca");
				opcao2 = entrada.nextInt();
				if(opcao2 == 1) {
					System.out.println("=== Valor para Transferência ===");
					valor = Double.parseDouble(new Scanner(System.in).nextLine());
					poupanca.transferir(valor, cc);
				} else {
					System.out.println("=== Valor para Transferência ===");
					valor = Double.parseDouble(new Scanner(System.in).nextLine());
					cc.transferir(valor, poupanca);
				}
				break;
			case 4:
				System.out.println("=== Conta Corrente - EXTRATO ===");
				cc.extrato();
				System.out.println("=== Poupanca - EXTRATO ===");
				poupanca.extrato();
				break;
			}
		}
		entrada.close();
	}		
}
