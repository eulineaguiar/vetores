package exercicios;

import java.util.Arrays;

public class Exercicio10 {

    public static void main(String[] args) {
        int[] vetor1 = { 1, 3, 5, 7, 9 };
        int[] vetor2 = { 2, 4, 6, 8, 10 };

        int[] vetorUniao = unirVetores(vetor1, vetor2);

        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
        System.out.println("Vetor União: " + Arrays.toString(vetorUniao));
    }

    public static int[] unirVetores(int[] vetor1, int[] vetor2) {
        int tamanhoVetor1 = vetor1.length;
        int tamanhoVetor2 = vetor2.length;
        int[] vetorUniao = new int[tamanhoVetor1 + tamanhoVetor2];

        for (int i = 0; i < tamanhoVetor1; i++) {
            vetorUniao[i] = vetor1[i];
        }

        for (int i = 0; i < tamanhoVetor2; i++) {
            vetorUniao[tamanhoVetor1 + i] = vetor2[i];
        }

        return vetorUniao;
    }
}