package exercises;

import java.util.Scanner;

public class ProblemaSomaVetor {
	public static void main(String[] args) {

		// Scanner para ler os dados digitados
		Scanner sc = new Scanner(System.in);
		// msg para o usuário
		System.out.print("Quantos números você vai digitar? ");
		// qtd de itens e também tamanho do array
		int n = sc.nextInt();
		int[] vect = new int[n];

		// laço for preenchendo o array até atingir o limite definido
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número?");
			vect[i] = sc.nextInt();
		}

		// imprimindo os valores
		System.out.print("Valores: ");
		for (int i = 0; i < n; i++) {
			System.out.print(vect[i] + " ");
		}

		// soma dos valores dos arrays
		int soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma = soma + vect[i];
		}
		// exibindo valores
		System.out.println();
		int calculoSoma = soma;
		int calculoMedia = soma / vect.length;
		System.out.println("Soma = " + calculoSoma);
		System.out.println("Soma = " + calculoMedia);

	}
}
