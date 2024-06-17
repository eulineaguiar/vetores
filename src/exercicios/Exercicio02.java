package exercicios;

public class Exercicio02 {
	public static void main(String[] args) {
    int[] vetor = { 5, 17, -3, 8, 0, 12 };
    encontrarMaiorEMenor(vetor);
    }
    public static void encontrarMaiorEMenor(int[] vetor) {
    if (vetor == null || vetor.length == 0) {
    System.out.println("Vetor vazio. Não há maior e menor valor.");
    return;
    }
    int menor = vetor[0];
    int maior = vetor[0];
    for (int i = 1; i < vetor.length; i++) {
    if (vetor[i] < menor) {
    menor = vetor[i];
    } else if (vetor[i] > maior) {
    maior = vetor[i];
    }
    }
    System.out.println("O menor valor no vetor é: " + menor);
    System.out.println("O maior valor no vetor é: " + maior);
    }
}