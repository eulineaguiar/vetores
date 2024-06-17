package exercicios;

public class Exercicio07 {

    public static void main(String[] args) {
        int[] vetor = { 5, 2, 9, 1, 5, 6 };
        ordenarVetorCrescente(vetor);
        System.out.print("Vetor ordenado em ordem crescente: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void ordenarVetorCrescente(int[] vetor) {
        int n = vetor.length;
        boolean trocou;
        
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
            n--;
        } while (trocou);
    }
}