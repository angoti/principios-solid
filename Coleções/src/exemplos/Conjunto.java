package exemplos;

//Elimina duplicadas em uma lista de inteiros

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conjunto {
	public Conjunto() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(3);
		lista.add(4);
		System.out.printf("ArrayList: %s\n", lista);
		retiraDuplicadas(lista);
	}

	private void retiraDuplicadas(Collection<Integer> collection) {
		Set<Integer> set = new HashSet<Integer>(collection);
		System.out.println("\nLista sem duplicadas: ");
		for (Integer s : set)
			System.out.printf("%s ", s);
		System.out.println();
	}

	public static void main(String args[]) {
		new Conjunto();
	}
}