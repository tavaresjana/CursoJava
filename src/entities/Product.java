package entities;

public class Product {

	// atributos
	String name;
	private double price;
	private int quantity;

	/*
	 * Não é necessário construir na mão os construtores e gets/sets, basta usar o
	 * botão direito e seguir esse passo:
	 *  -> Construtor - Source - Generate Constructor using Fields. 
	 *  -> Getters & Setters - Source - Generate Getters and Setters.
	 */

	// construtor padrão
	public Product() {
	}

	// construtor c tds atributos como parametros
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// construtor sobrecarga com atributos diferentes, mas mesma assinatura
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

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
