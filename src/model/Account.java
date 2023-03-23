package model;

import javax.security.auth.login.AccountException;

public class Account {
	private int number;
	private String nome;
	private double saldoAtual;
	private double limite;
		
	
	public Account(int number, String nome, double saldoAtual, double limite ) {
		this.number = number;
		this.nome = nome;
		this.saldoAtual = saldoAtual;
		this.limite = limite;
	}
	
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldoAtual() {
		return saldoAtual;
	}


	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public void depositar(double valor) throws AccountException {
		
		System.out.println("Valor do deposito: "+ valor);
		
		if(valor > 0 ) {
			 setSaldoAtual(getSaldoAtual() + valor);
		}else {
			throw new AccountException("o Valor para depositar deve ser maior que Zero.");
		}
	}
	
	public void sacar(double valor) throws AccountException {
		System.out.println("Valor do saque: "+ valor);
		
		if(saldoAtual < valor) {
			throw new AccountException("Saldo insuficiente");
			}
		if(valor > limite) {
			throw new AccountException("Saque acima do limite permitido. ");			
		}else {
			setSaldoAtual(getSaldoAtual() - valor);
		}
	}

	@Override
	public String toString() {
		return "Account [number= " + number 
				+ ", holder= " + nome 
				+ ", balance= "+ saldoAtual 
				+ ", withDrawLimit= " + limite + "]";
	}
	
	

}
