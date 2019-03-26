package exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Conta implements Comparable<Conta> {
	int saldo;

	public Conta(int saldo) {
		super();
		this.saldo = saldo;
	}

	void deposita(int valor) {
		saldo += valor;
	}

	@Override
	public String toString() {
		return "Saldo: " + saldo;
	}

	@Override
	public int compareTo(Conta o) {
		if (this.saldo < o.saldo) {
			return -1;
		}
		if (this.saldo > o.saldo) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		List<Conta> contas = Arrays.asList(new Conta(100), new Conta(10), new Conta(50), new Conta(2));
		/*
		 * List<Conta> contas = new ArrayList<Conta>(); contas.add(new Conta(100)); contas.add(new Conta(10)); contas.add(new Conta(50)); contas.add(new Conta(2));
		 */
		System.out.println(contas);
		Collections.sort(contas);
		System.out.println(contas);
		
		Iterator<Conta> i = contas.iterator();
		System.out.println("--------------------------------");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
