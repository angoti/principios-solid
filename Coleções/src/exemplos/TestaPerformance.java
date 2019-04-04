package exemplos;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class TestaPerformance {

     public static void main(String[] args) {
         System.out.println("Iniciando...");
         //Collection<Integer> teste = new ArrayList<>();
         //Collection<Integer> teste = new HashSet<>();
         Collection<Integer> teste = new LinkedList<>();
         long inicio = System.currentTimeMillis();

         int total = 30000;

         for (int i = 0; i < total; i++) {
             teste.add(i);
         }

         for (int i = 0; i < total; i++) {
             teste.contains(i);
         }

         long fim = System.currentTimeMillis();
         long tempo = fim - inicio;
         System.out.println("Tempo gasto: " + tempo);
     }
 }