import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;

		/*
		 * temos que usar o 'nextLine()' pois assim será lido a frase, se usar somente o 'next()'
		 * será lido apenas a primeira palavra
		 */
		x = sc.nextInt();
		sc.nextLine();
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
