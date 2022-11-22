import java.util.Locale;
import java.util.Scanner;

public class ExerciciosPropostos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Exercicio 1. Faça um programa para ler dois valores inteiros, e depois
		 * mostrar na tela a soma desses números com uma mensagem explicativa, conforme
		 * exemplos.
		 */
		int a, b;
		System.out.println("Insira dois números inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Entrada: ");
		System.out.println(a + "\n" + b);
		System.out.println("Saída:");
		System.out.println("Soma = " + (a + b));

		/*
		 * Exercicio 2. Faça um programa para ler o valor do raio de um círculo, e
		 * depois mostrar o valor da área deste círculo com quatro casas decimais
		 * conforme exemplos. Fórmula da área: area = π . raio2 Considere o valor de π =
		 * 3.14159
		 */
		double raio, pi = 3.14159, area;
		System.out.println("Informe o valor do raio: ");
		raio = sc.nextDouble();
		Locale.setDefault(Locale.US);
		area = pi * (Math.pow(raio, 2));
		System.out.printf("%.4f", area);

		/*
		 * Exercicio 3. Fazer um programa para ler quatro valores inteiros A, B, C e D.
		 * A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C
		 * e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		int a1, b1, c, d, dif;
		System.out.println("Informe quatro números inteiros: ");
		a1 = sc.nextInt();
		b1 = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		dif = (a1 * b1 - c * d);
		System.out.println("Entrada: ");
		System.out.println(a1 + "\n" + b1 + "\n" + c + "\n" + d);
		System.out.println("Diferença = " + dif);

		/*
		 * Exercicio 4. Fazer um programa que leia o número de um funcionário, seu
		 * número de horas trabalhadas, o valor que recebe por hora e calcula o salário
		 * desse funcionário. A seguir, mostre o número e o salário do funcionário, com
		 * duas casas decimais.
		 */
		int num;
		double horas, valor, salario;
		System.out.println("Informe seu número: ");
		num = sc.nextInt();
		System.out.println("Informe a qtd de horas:");
		horas = sc.nextDouble();
		System.out.println("Informe o valor hora:");
		valor = sc.nextDouble();
		salario = horas * valor;
		System.out.println("Salario = " + salario);

		/*
		 * Exercicio 5. Fazer um programa para ler o código de uma peça 1, o número de
		 * peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de
		 * peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser
		 * pago.
		 */
		int cod1, qtd1, cod2, qtd2;
		double valor1, valor2, valorPagar;

		System.out.println("Código da primeira peça: ");
		cod1 = sc.nextInt();
		System.out.println("Qtd. de peças: ");
		qtd1 = sc.nextInt();
		System.out.println("Valor da peça: ");
		valor1 = sc.nextDouble();

		System.out.println("Código da segunda peça: ");
		cod2 = sc.nextInt();
		System.out.println("Qtd. de peças: ");
		qtd2 = sc.nextInt();
		System.out.println("Valor da peça: ");
		valor2 = sc.nextDouble();

		valorPagar = (qtd1 * valor1) + (qtd2 * valor2);
		System.out.printf("Valor a pagar: %.2f", valorPagar);

		/*
		 * Exercicio 6. Fazer um programa que leia três valores com ponto flutuante de
		 * dupla precisão: A, B e C. Em seguida, calcule e mostre: a) a área do
		 * triângulo retângulo que tem A por base e C por altura. b) a área do círculo
		 * de raio C. (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C
		 * por altura. d) a área do quadrado que tem lado B. e) a área do retângulo que
		 * tem lados A e B.
		 */
		double a2, b2, c2, triangulo, circulo, trapezio, quadrado, retangulo;
		System.out.println("Informe valores para a, b e c:");
		a2 = sc.nextDouble();
		b2 = sc.nextDouble();
		c2 = sc.nextDouble();

		triangulo = a2 * c2 / 2.0;
		circulo = 3.14159 * c2 * c2;
		trapezio = (a2 + b2) / 2.0 * c2;
		quadrado = b2 * b2;
		retangulo = a2 * b2;

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();
	}

}
