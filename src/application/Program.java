package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do produto");

		// coletando dados do produto
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Preço: ");
		double price = sc.nextDouble();

		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		
		product.setName("Computador");
		System.out.println("Nome atualizado: "+product.getName());
		product.setPrice(1200.00);
		System.out.println("Preço atualizado: "+product.getPrice());
		
		// exibindo produtos
		System.out.println();
		System.out.println("Produto: " + product);

		// add produtos
		System.out.println();
		System.out.print("Entre com o numero de produtos a serem adicionados: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		// exibindo atualização dos produtos
		System.out.println();
		System.out.println("Atualização: " + product);
		
		// remove produtos
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
