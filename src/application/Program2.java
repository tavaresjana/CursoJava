package application;

import java.util.Scanner;

import entities.Student;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student st = new Student();

		System.out.print("Informe seu nome: ");
		st.nome = sc.nextLine();
		System.out.print("Informe a nota do primeiro, segundo e terceiro trimestre: ");
		st.nota1 = sc.nextDouble();
		st.nota2 = sc.nextDouble();
		st.nota3 = sc.nextDouble();

		System.out.println("Sua nota final foi: " + st.notaFinal());

		if (st.notaFinal() < 60.0) {
			System.out.println("Reprovado.");
			System.out.println("Faltam " + st.pontosFaltantes() + " pontos para alcançar a aprovação");
		} else {
			System.out.println("Aprovado!");
		}
		sc.close();
	}

}
