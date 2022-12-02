package exercises;

public class FuncoesString {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		// string original original
		System.out.println("Original: -" + original);

		// tudo será impresso em minuscula
		System.out.println("toLowerCase: -" + s01);

		// tudo será impresso em maiuscula
		System.out.println("toUpperCase: -" + s02);

		// remove os espaços em branco no inicio e fim de uma string
		System.out.println("trim: -" + s03);

		// substring montará uma nova string a partir da posição indicada
		System.out.println("substring(2): " + s04);

		// substring montará uma nova string dentro do intervalo indicado
		System.out.println("substring(2,9): " + s05);

		// replace substituirá os caracteres indicados
		System.out.println("replace ('a','x'): " + s06);

		// replace substituirá os caracteres indicados
		System.out.println("replace('abc','xy'): " + s07);

		// mostra a primeira e ultima ocorrencia de 'bc'
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		// split separa os dados da string
		String s = "potato apple lemon orange";

		String[] vect = s.split(" "); // a cada espaço encontrado os termos da string serão separados

		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);

	}

}
