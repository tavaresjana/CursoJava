package exercises;

import java.util.Scanner;

public class ProblemaMaiorPosição {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maior=0; 
		
		System.out.print("Qtds numeros voc~e vai digitar? ");
		int n = sc.nextInt();
		
		int[]vect = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(vect[i]<maior) {
				maior = vect[i];
			}
		}
		System.out.println(maior);
		
		
	}
}
