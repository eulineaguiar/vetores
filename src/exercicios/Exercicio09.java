package exercicios;

import java.util.Arrays;

public class Exercicio09 {

    public static void main(String[] args) {
        int[] vetor = { 5, 2, 9, 1, 5, 6 };
        int elementoParaRemover = 5;

        int[] vetorAtualizado = removerElementoDoVetor(vetor, elementoParaRemover);

        System.out.println("Vetor original: " + Arrays.toString(vetor));
        System.out.println("Vetor após remover o elemento " + elementoParaRemover + ": " + Arrays.toString(vetorAtualizado));
    }

    public static int[] removerElementoDoVetor(int[] vetor, int elemento) {
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                count++;
            }
        }

        int[] novoVetor = new int[vetor.length - count];
        int index = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != elemento) {
                novoVetor[index++] = vetor[i];
            }
        }

        return novoVetor;
    }
}