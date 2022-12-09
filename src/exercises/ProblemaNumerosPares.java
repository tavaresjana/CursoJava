package exercises;

import java.util.Scanner;

public class ProblemaNumerosPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			if(vect[i]%2==0) {
				System.out.print(vect[i]+" ");
			}
		}
		
	}

}
