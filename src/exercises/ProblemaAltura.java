package exercises;

import java.util.Scanner;

public class ProblemaAltura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, nmenores;
		double alturatotal, alturamedia, percentualMenores;

		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();

		String[] vectNome = new String[n];
		int[] vectIdade = new int[n];
		double[] vectAltura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da pessoas");
			System.out.print("Nome: ");
			vectNome[i] = sc.next();

			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();

			System.out.print("Altura: ");
			vectAltura[i] = sc.nextDouble();
		}
		// contador de numero de menores
		nmenores = 0;
		// total da altura
		alturatotal = 0;

		for (int i = 0; i < n; i++) {
			if (vectIdade[i] < 16) {
				nmenores++;
			}
			alturatotal = alturatotal + vectAltura[i];
		}

		alturamedia = alturatotal / n;
		// calculo da porcentagem de menores de 16
		percentualMenores = ((double) nmenores / n) * 100.0;
		System.out.println("Altura media: " + alturamedia);
		System.out.println("Pessoas com menos de 16 anos: " + percentualMenores);

		double soma = 0;
		for (int i = 0; i < vectAltura.length; i++) {
			if (vectIdade[i] < 16) {
				System.out.println(vectNome[i]);
			}
		}

	}

}
