package exemplos;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Teste {
  public static void main(String[] args) {
    List<String> lista = new ArrayList<String>();
    lista.add("Sérgio");
    lista.add("Paulo");
    lista.add("Guilherme");

    // repare que o toString de ArrayList foi sobrescrito:
    System.out.println(lista); 

    Collections.sort(lista);

    System.out.println(lista);
  }
}