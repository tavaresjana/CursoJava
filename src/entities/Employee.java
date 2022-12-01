package entities;

public class Employee {

	// atributos
	public String name;
	public double grossSalary;
	public double tax;

	// salario liquido
	public double netSalary() {
		return grossSalary - tax;
	}

	// salario com aumento
	public void increaseSalary(double percentage) {
		grossSalary = (grossSalary + (grossSalary * percentage / 100.0));
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
