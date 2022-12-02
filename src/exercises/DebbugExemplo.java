package exercises;
import java.util.Locale;
import java.util.Scanner;

public class DebbugExemplo {
	public static void main(String[] args) {

		/*
		 * Para debugar é necessário: 1 estabelecer breakpoint, fazemos isso indo em
		 * 'RUN' e selecionando toggle breakpoint já na linha desejada. 2 Rodamos o
		 * programa em 'Debbug As Java Application'. Quando chegar no breakpoint uma
		 * tela para acompanhar o debbug será aberta, nela veremos a entrada de dados em
		 * cada variavel. 3 Para acompanhar cada linha usamos F6. 4 Quadrado
		 * vermelho/Stop para sair dessa tela.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();
	}
}
