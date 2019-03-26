package exemplos;

//Contador de palavras em uma frase

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mapa {
	private Map<String, Integer> map;
	private Scanner scanner;
	public Mapa() {
		map = new HashMap<String, Integer>();
		scanner = new Scanner(System.in);
		criaMapa();
		imprimeMapa();
	}

	private void criaMapa() {
		System.out.println("Digite palavras separadas por virgula: ");
		String entrada = scanner.nextLine();
		String[] listaPalavras = entrada.split(",");
		for (String palavra : listaPalavras) {
			if (map.containsKey(palavra)) {
				int c = map.get(palavra);
				map.put(palavra, ++c);
			} else
				map.put(palavra, 1);
		}
	}

	private void imprimeMapa() {
		Set<String> chaves = map.keySet();
		System.out.println("Conteúdo do mapa contains:\nCahve\t\tValor");
		for (String chave : chaves)
			System.out.printf("%-10s%10s\n", chave, map.get(chave));
	}

	public static void main(String args[]) {
		new Mapa();
	}
}