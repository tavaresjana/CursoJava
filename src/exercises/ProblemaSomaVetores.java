package exercises;

import java.util.Scanner;

public class ProblemaSomaVetores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		System.out.println("Digite os valores do vetor A:");

		int[] vectA = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor A:");
		
		int[] vectB = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vectB[i] = sc.nextInt();
		}
		
		int soma=0;
		
		for (int i = 0; i < n; i++) {
			soma = vectA[i]+vectB[i];
			System.out.println(soma+" ");
		}

	}

}
