package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Entre com os dados do produto");

		// coletando dados do produto
		System.out.print("Name: ");
		product.name = sc.nextLine();

		System.out.print("Preço: ");
		product.price = sc.nextDouble();

		System.out.print("Quantidade: ");
		product.quantity = sc.nextInt();

		// exibindo produtos
		System.out.println();
		System.out.println("Produto: " + product);

		// add produtos
		System.out.println();
		System.out.print("Entre com o numero de produtos a serem adicionados: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		// exibindo atualização dos produtos
		System.out.println();
		System.out.println("Atualização: " + product);

		System.out.println();
		System.out.print("Entre com o numero de produtos a serem removidos: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		// exibindo atualização dos produtos
		System.out.println();
		System.out.println("Atualização: " + product);

		/*
		 * Após criar um 'new Product()' dentro da classe Program, podemos acessar os
		 * atributos de Produto. Assim chamamos ele: 'product.name = sc.nextLine();' e
		 * atribuimos a ele o valor coletado pelo Scanner.
		 */

		sc.close();
	}

}
