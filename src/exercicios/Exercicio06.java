package exercicios;

import java.util.HashMap;
import java.util.Map;

public class Exercicio06 {

    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 2, 1, 3, 4, 5, 2, 4, 1 };

        Map<Integer, Integer> frequenciaElementos = calcularFrequenciaElementos(vetor);

        System.out.println("Frequência de elementos no vetor:");
        for (Map.Entry<Integer, Integer> entry : frequenciaElementos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> calcularFrequenciaElementos(int[] vetor) {
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int elemento : vetor) {
            if (frequencia.containsKey(elemento)) {
                frequencia.put(elemento, frequencia.get(elemento) + 1);
            } else {
                frequencia.put(elemento, 1);
            }
        }

        return frequencia;
    }
}