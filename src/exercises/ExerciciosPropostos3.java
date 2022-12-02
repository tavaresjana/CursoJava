package exercises;
import java.util.Scanner;

public class ExerciciosPropostos3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Exercicio 1
		int senha;
		String valido = "Acesso permitido", invalido = "Senha inválida";

		do {
			System.out.print("Informe a senha: ");
			senha = sc.nextInt();

			String msg = (senha == 2002) ? valido : invalido;

			System.out.println(msg + "\n");

		} while (senha != 2002);

		// Exercicio 2
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}

		// Exercicio 3
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Informe um valor 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			} else if (tipo == 3) {
				diesel = diesel + 1;
			}
			System.out.println("Informe um valor 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
			tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}