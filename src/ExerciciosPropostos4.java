import java.util.Scanner;

public class ExerciciosPropostos4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve
		 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
		 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo.
		 */

		int n, i;
		System.out.println("Digite um número: ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			/*
			 * pega o número do contator e exibe mostrando a qtd de vezes digitadas. Depois
			 * multiplica pelo quadrado e cubo.
			 */
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;

			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
	}
}