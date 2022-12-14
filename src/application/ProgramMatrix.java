package application;

import java.util.Scanner;

public class ProgramMatrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		//for coletando dados da matrix
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		//for imprimindo diagonal principal
		System.out.println("Diagonal principal: ");
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i]+" ");
		}
		System.out.println();
		
		//imprimindo numeros negativos
		int count =0;
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j]<0) {
					count++;
				}
			}
		}
		System.out.println("Numeros negativos = "+count);
		
		
		sc.close();
	}
}
