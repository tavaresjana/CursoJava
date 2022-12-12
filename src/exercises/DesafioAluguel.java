package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class DesafioAluguel {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// 10 posições
		Rent[] vect = new Rent[10];

		System.out.print("Quantos quartos serão alugados?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.next();

			System.out.print("Quarto: ");
			int roomNumber = sc.nextInt();

			vect[roomNumber] = new Rent(name, email);

			/*
			 * Então você está instanciando o objeto e atribuindo a referencia dele para o
			 * vetor na posição RoomNumber que o usuario informou. Ex: O usuario digitiou no
			 * quarto 5, instanciamos ele e atribuimos a posição 5.
			 */
		}

		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();
	}
}
