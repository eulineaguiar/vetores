package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int soma = calcularSoma(vetor);
        System.out.println("A soma de todos os elementos do vetor é: " + soma);
    }

    public static int calcularSoma(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }
}