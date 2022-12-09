package exercises;

import java.util.Scanner;

public class ProblemaNegativos {

	public static void main(String[] args) {

		// Scanner para ler os dados
		Scanner sc = new Scanner(System.in);

		// msg solicitando a qtd de vezes que o programa deve rodar
		System.out.print("Quantas vezes deseja rodar o programa?");
		// variavel que armazenará essa qtd de vezes e será usada para definir os
		// limites do laço de repetição
		int n = sc.nextInt();

		// contador começando em 0
		int i = 0;

		// vetor que terá n indices (valor de n declarado no inicio do programa)
		int[] vect = new int[n];

		// laço de repetição que irá captar os numeros dentro da qtd de vezes indicada
		for (i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("Números negativos: ");

		// laço de repetição que irá captar e imprimir, através do if, os numeros
		// negativos
		for (i = 0; i < n; i++) {
			if (vect[i] < 0) {
				// sysout imprimindo os valores que entraram dentro desse if
				System.out.println(vect[i]);
			}
		}
		sc.close();

	}

}
