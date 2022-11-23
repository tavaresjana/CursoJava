
public class CondicionalTernaria {

	public static void main(String[] args) {

		/*
		 * Expressão Condicional Ternária. Estrutura opcional ao if-else quando se
		 * deseja decidir um valor com base em uma condição. Lendo a expressão: se preco
		 * menor que 20, multiplique por 0.1. se preco maior que 20, multiplique por
		 * 0.5. (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		 */
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.println(desconto);

		/*
		 * Expressão com If-Else double preco = 34.5; double desconto; if (preco < 20.0)
		 * { desconto = preco * 0.1; } else { desconto = preco * 0.5; }
		 */
	}

}
