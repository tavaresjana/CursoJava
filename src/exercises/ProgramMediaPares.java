package exercises;

import java.util.Scanner;

public class ProgramMediaPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, somapares = 0, npares = 0;
		double mediapares;

		System.out.print("Quantos elementos o vetor vai ter? ");
		n = sc.nextInt();

		// o vetor do tipo int terá N indices
		int[] vect = new int[n];

		// o laço for roda de 0 a N vezes
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			// quando o vetor possuir indice [i](0 até N) ele vai ler o que for digitado
			vect[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				somapares = somapares + vect[i];
				npares++;
			}
		}

		if (npares == 0) {
			System.out.println("Nenhum número par");
		} else {
			mediapares = (double) somapares / npares;
			System.out.println("Média dos pares: " + mediapares);
		}
		sc.close();
	}
}
