package exercicios;

public class Exercicio08 {

    public static void main(String[] args) {
        int[] vetor = { 5, 2, 9, 1, 5, 6 };
        int elemento = 9;

        boolean encontrado = verificarElementoNoVetor(vetor, elemento);

        if (encontrado) {
            System.out.println("O elemento " + elemento + " está presente no vetor.");
        } else {
            System.out.println("O elemento " + elemento + " não está presente no vetor.");
        }
    }

    public static boolean verificarElementoNoVetor(int[] vetor, int elemento) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }
}