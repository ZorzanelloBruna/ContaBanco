import java.util.Locale;
import java.util.Scanner;

import javax.security.auth.login.AccountException;

import model.Account;

public class AccountTest {

	public static void main(String[] args) throws AccountException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("saldo atual: ");
		double saldoAtual = sc.nextDouble();
		System.out.print("Valor do limite: ");
		double limite = sc.nextDouble();
		
		Account conta = new Account(number, nome, saldoAtual, limite);
		
		conta.depositar(300);
		conta.sacar(150);
		
		
		System.out.println();
		System.out.println("Novo Saldo: " + conta.getSaldoAtual());
		
		sc.close();

	}

}
