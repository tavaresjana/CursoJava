package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class DesafioFuncionarios {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("Quantos funcionarios deseja cadastrar?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionário #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id já ocupado. Tente novamente: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salário: ");
			Double salary = sc.nextDouble();

			Funcionario func = new Funcionario(id, name, salary);

			list.add(func);
		}

		System.out.println();
		System.out.print("Entre com o id do funcionário que receberá aumento de salário: ");
		int idSalary = sc.nextInt();

		Funcionario func = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		// Integer pos = position(list, idSalary);

		if (func == null) {
			System.out.println("Esse id não existe!");
		} else {
			System.out.print("Entre com a porcentagem: ");
			double percent = sc.nextDouble();
			func.increaseSalary(percent);
		}

		System.out.println();
		System.out.println("Lista de funcionários: ");
		for (Funcionario e : list) {
			System.out.println(e);
		}
		sc.close();
	}

	public static Integer position(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
}
