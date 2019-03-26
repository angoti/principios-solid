package exemplos;

//Demonstra o iterator em uma lista

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {

	public Lista() {
		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();
		lista.add(0);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		lista2.add(2);
		lista2.add(3);
		System.out.println("ArrayList: ");
		for (Integer integer : lista) {
			System.out.print(integer + " ");
		}
		remove2(lista, lista2);
		System.out.println("\n\nArrayList depois da remoção: ");
		for (Integer n : lista)
			System.out.print(n + " ");
	}

	private void remove1(List<Integer> collection1, List<Integer> collection2) {
		Iterator<Integer> iterator = collection1.iterator();
		while (iterator.hasNext())
			if (collection2.contains(iterator.next()))
				iterator.remove();
	}

	void remove2(List<Integer> collection1, List<Integer> collection2) {
		for (int i = 0; i < collection1.size(); i++) {
			if (collection2.contains(collection1.get(i))) {
				collection1.remove(i);
			}
		}
	}

	public static void main(String args[]) {
		new Lista();
	} // end main
}