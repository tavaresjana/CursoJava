package application;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
	
	public static final double IOF = 0.06;
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		double precoDolar, precoReal, qtdDolares;

		Scanner sc = new Scanner(System.in);

		System.out.println("preço do dolar? ");
		precoDolar = sc.nextDouble();
		System.out.println("quantos dolares você deseja comprar? ");
		qtdDolares = sc.nextDouble();
		System.out.println("você pagará em reais: " + DolarEmReais(qtdDolares, precoDolar));

	}

	public static double DolarEmReais(double qtdDolares, double precoDolar) {
		return (qtdDolares * precoDolar * (1.0 + IOF));
	}
}
