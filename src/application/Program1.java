package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println("Entre com os dados do funcionário.");

		System.out.print("Nome: ");
		employee.name = sc.nextLine();

		System.out.print("Salário bruto: ");
		employee.grossSalary = sc.nextDouble();

		System.out.print("Taxa: ");
		employee.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Funcionário: " + employee);

		System.out.println();
		System.out.print("Qual a porcentagem de aumento do salário: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		System.out.println();
		System.out.println("Funcionário: " + employee);
		sc.close();
	}

}
