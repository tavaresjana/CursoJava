package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramArray {
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//Adicionando itens na lista. Indicando a posição e o que deseja adicionar
		list.add(2, "Marco");

		//Verificando o tamanho da lista.
		System.out.println(list.size());
		
		//Removendo elementos da lista
	//	list.remove(1);
	//	list.remove("Anna");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		//função removendo elementos que começam com M
		list.removeIf(x -> x.charAt(0) == 'M'); //função lambda
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
	
	}
}
