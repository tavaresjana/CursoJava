package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	/*
	 * Nesse exercicio teremos duas formas de iniciar, uma sem receber e outra
	 * recebendo valor de deposito inicial. Por isso teremos dois tipos de
	 * construtor: um que recebe 2 outro que recebe 3 argumentos.
	 */

	// Esse construtor receberá o Número da Conta e o Nome do Titular
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	// Esse construtor receberá o Número da Conta e o Nome do Titular e Saldo
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	/*
	 * Fizemos os Getters and Setter, mas mantivemos apenas o getNumber, pois o
	 * exercicio informa que não pode ser possivel alterar o Número da Conta.
	 */
	public int getNumber() {
		return number;
	}

	/*
	 * Fizemos os Getters and Setter e mantivemos gets e sets, pois o exercicio
	 * informa que deve ser possivel alterar o Nome do Titular.
	 */
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	/*
	 * Fizemos os Getters and Setter, mas mantivemos apenas o getBalance, pois o
	 * exercicio informa que não pode ser possivel alterar o Saldo da Conta.
	 */
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: "
				+ holder
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);
	}

}
