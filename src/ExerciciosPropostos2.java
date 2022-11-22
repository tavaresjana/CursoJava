import java.util.Scanner;

public class ExerciciosPropostos2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Exercicio 1. Fazer um programa para ler um número inteiro, e depois dizer se
		 * este número é negativo ou não.
		 */

		int numero;
		System.out.println("Informe um número: ");
		numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Negativo.");
		} else {
			System.out.println("Não negativo.");
		}

		/*
		 * Exercicio 2. Fazer um programa para ler um número inteiro e dizer se este
		 * número é par ou ímpar
		 */
		int num;
		System.out.println("Informe um número: ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Número é par");
		} else {
			System.out.println("Número é ímpar");
		}

		/*
		 * Exercicio 3. Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
		 * uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
		 * lidos são múltiplos entre si. Atenção: os números devem poder ser digitados
		 * em ordem crescente ou decrescente
		 */
		int a, b;
		System.out.println("Informe um valor inteiro: ");
		a = sc.nextInt();
		System.out.println("Informe um número: ");
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são multiplos");
		}

		/*
		 * Exercicio 4. Leia a hora inicial e a hora final de um jogo. A seguir calcule
		 * a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em
		 * outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		int horaInicial, horaFinal, tempoTotal;
		System.out.println("Informe a hora inicial: ");
		horaInicial = sc.nextInt();
		System.out.println("Informe a hora final: ");
		horaFinal = sc.nextInt();

		if (horaInicial < horaFinal) {
			tempoTotal = horaFinal - horaInicial;
		} else {
			tempoTotal = 24 - horaInicial + horaFinal;
			// ao subtrair 24-horaInicial vamos obter o valor das horas desse dia, depois só
			// é necessário somar com as horas restantes do outro dia
		}
		System.out.println("O jogo durou " + tempoTotal + " horas");

		/*
		 * Exercicio 5. Com base na tabela abaixo, escreva um programa que leia o código
		 * de um item e a quantidade deste item. A seguir, calcule e mostre o valor da
		 * conta a pagar.
		 */
		int cod, qtd;
		double valor = 0, valorPagar;

		System.out.println("Código do item: ");
		cod = sc.nextInt();
		System.out.println("Qtd. de item: ");
		qtd = sc.nextInt();

		if (cod == 1) {
			valor = 4.00;
			System.out.printf("Cachorro Quente - Preço: %.2f - Qtd: %d", valor, qtd);
		} else if (cod == 2) {
			valor = 4.50;
			System.out.printf("X-Salada - Preço: %.2f - Qtd: %d", valor, qtd);
		} else if (cod == 3) {
			valor = 5.00;
			System.out.printf("X-Bancon - Preço: %.2f - Qtd: %d", valor, qtd);
		} else if (cod == 4) {
			valor = 2.00;
			System.out.printf("Torrada simples - Preço: %.2f - Qtd: %d", valor, qtd);
		} else if (cod == 5) {
			valor = 1.50;
			System.out.printf("Refrigerante - Preço: %.2f - Qtd: %d", valor, qtd);
		}

		valorPagar = qtd * valor;
		System.out.println();
		System.out.printf("Total: R$ %.2f", valorPagar);

		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
		 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 */
		double number;
		System.out.println("Informe um número: ");
		number = sc.nextDouble();

		if (number >= 0 && number <= 25) {
			System.out.println("está no intervalo [0,25]");
		} else if (number >= 25 && number < 51) {
			System.out.println("está no intervalo [25,50]");
		} else if (number >= 50 && number <= 75) {
			System.out.println("está no intervalo [50,75]");
		} else if (number >= 75 && number <= 100) {
			System.out.println("está no intervalo [75,100]");
		} else {
			System.out.println("fora de intervalo");
		}
	}

}
