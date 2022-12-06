package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);

		/*
		 * Estrutura de decisão para o usuário decidir se desejar criar uma conta com
		 * deposito inicial ou não.
		 */

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		//Retornando os dados da conta que foram digitados pelo usuário
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		//Solicitando valor de deposito
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		//mostrando saldo da conta atualizado
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		//Solicitando valor de saque
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		//mostrando saldo da conta atualizado
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		sc.close();
	}
}