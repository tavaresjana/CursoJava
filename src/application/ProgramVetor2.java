package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramVetor2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// o n foi substituido por vect.length

		/*
		 * Temas da aula: vetor, declaração e instanciação, manipulação de vetor de
		 * elementos tipo valor(tipo primtivo), manipulação de vetor de elementos tipo
		 * referência(classe), acesso aos elementos, propriedade length.
		 */

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("Average price = %.2f%n", avg);

		sc.close();

	}
}
