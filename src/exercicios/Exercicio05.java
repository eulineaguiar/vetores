package exercicios;

public class Exercicio05 {

    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int quantidadePares = contarNumerosPares(vetor);

        System.out.println("Quantidade de números pares no vetor: " + quantidadePares);
    }

    public static int contarNumerosPares(int[] vetor) {
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
