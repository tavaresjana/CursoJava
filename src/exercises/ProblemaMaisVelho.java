package exercises;

import java.util.Scanner;

public class ProblemaMaisVelho {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();

		String[] vectNome = new String[n];
		int[] vectIdade = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + i + "a pessoa: ");
			System.out.print("Nome: ");
			vectNome[i] = sc.next();

			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();
		}
		
		int maioridade = vectIdade[0];
		int posicaomaior=0;
		
		for (int i = 1; i < n; i++) {
			if (vectIdade[i] > maioridade) {
				maioridade = vectIdade[i];
				posicaomaior = i;
			}
		}
		
		System.out.printf("pessoa mais velha: %s\n",vectNome[posicaomaior]);
		

	}
}
