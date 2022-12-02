package exercises;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		// o sysout.println imprime em outra linha
		System.out.println("Hello World!");

		// o sysout.print imprime na mesma linha
		System.out.print("Bom dia");

		System.out.println("Boa tarde");

		double x = 10.35784;
		System.out.println(x);
		/*
		 * com o "%.2f%n" o valor será impresso com a qtd de casas decimais indicadas,
		 * nos exemplos abaixo 2 e 4
		 */
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);

		/*
		 * Esse locale é usado para configurar a localização que servirá de base para
		 * nosso programa
		 */
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x); /*
										 * após usar o Locale e criar um novo sysout ele usa a formatação indicada, e
										 * agora não aparece mais virgula(,) mas sim um ponto(.)
										 */

		System.out.println("Resultado = " + x + " metros");

		/*
		 * usando printf: %.2f para imprimir duas casas decimais e o %n para quebra de
		 * linha
		 */
		System.out.printf("Resultado = %.2f metros%n", x);

		/*
		 * Usando o printf: %f = ponto flutuante %d = inteiro %s = texto %n = quebra de
		 * linha
		 */
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

		// Exercicio proposto:
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		/*
		 * EXERCÍCIOS DE FIXAÇÃO: Em seguida, usando os valores das variáveis, produza a
		 * seguinte saída na tela do console: Products: Computer, which price is $
		 * 2100,00 Office desk, which price is $ 650,50 Record: 30 years old, code 5290
		 * and gender: F Measue with eight decimal places: 53,23456700 Rouded (three
		 * decimal places): 53,235 US decimal point: 53.235
		 */

		System.out.printf("%s, wich price is $ %.2f%n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f%n", product2, price2);
		System.out.printf("Measue with decimal places: %.8f%n", measure);
		Locale.setDefault(new Locale("pt", "BR")); // chamando o Locale, a virgula voltará a aparecer
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US); // a virgula deixará de aparecer
		System.out.printf("US decimal point: %.3f", measure);

	}

}