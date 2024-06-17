package exercicios;

public class Exercicio03 {
	public static void main(String[] args) {
        double[] vetor = { 2.5, 7.8, 1.2, 4.6, 3.1 };
        double media = calcularMedia(vetor);
        System.out.println("A média dos elementos no vetor é: " + media);
    }

    public static double calcularMedia(double[] vetor) {
        if (vetor == null || vetor.length == 0) {
            return 0;
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        return soma / vetor.length;
    }
}