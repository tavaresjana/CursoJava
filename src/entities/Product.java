package entities;

public class Product {

	// atributos
	public String name;
	public double price;
	public int quantity;

	// metodos
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		/*
		 * ao usar o this.quantity estou sendo especifica, dizendo que quero usar o
		 * atributo da classe e não o parametro que está entre parenteses na função
		 */
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// esse metodo concatena as informaões digitadas em uma string e
	public String toString() {
		return name + ", $"
		// +price sai somente com 1 casa decimal, seguindo a formatação abaixo, sairá
		// com 2 casas decimais
				+ String.format("%.2f", price) + ", " + quantity + " unidades, Total: $ " + totalValueInStock();

	}
}
