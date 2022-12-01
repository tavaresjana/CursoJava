package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program3 {

	public static void main(String[] args) {
		/*
		 * o final indica uma constante, esse valor não será alterado. E nome de
		 * constantes geralmente são maiusculos e separados por _. Vão antes do main.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com valor de radius: ");
		double radius = sc.nextDouble();

		double c = Calculator.circumference(radius);

		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI vale: %.2f%n", Calculator.PI);

		sc.close();
	}

	/*
	 * Aula 71 - Membros estáticos part 1. Inicialmente esse exercicio foi feito
	 * usando static class, depois o conteúdo foi alterado e divido em mais de uma
	 * classe, dessa forma foi necessário instanciar um objeto e retirar o static
	 * dos metodos que foram passados pra outra classe. Aula 72 - Membros estáticos
	 * part 2. Posteriormente foi adicionado o static nos metodos da classe
	 * 'Calculator' e dessa forma não foi mais necessário instaciar o objeto na
	 * classe Program, e a chamada foi feita diretamente pelo nome Calculator.
	 */

	/*
	 * Os metodos abaixo recebem o static, pois dentro de uma classe static nao
	 * podemos chamar metodos que não sejam estaticos.
	 * 
	 * public static double circumference(double radius) { return 2.0 * PI * radius;
	 * } public static double volume(double radius) { return 4.0 * PI * radius *
	 * radius * radius / 3.0; }
	 */
}
