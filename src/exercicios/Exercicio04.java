package exercicios;

public class Exercicio04 {
	 public static void main(String[] args) {
	 int[] vetor = { 1, 2, 3, 4, 5 };
	 inverterVetor(vetor);
	 System.out.print("Vetor invertido: ");
	 for (int i = 0; i < vetor.length; i++) {
	 System.out.print(vetor[i] + " ");
	 }
	 System.out.println();
	 }
	 public static void inverterVetor(int[] vetor) {
	 int i = 0;
	 int j = vetor.length - 1;
	 while (i < j) {
	 int temp = vetor[i];
	 vetor[i] = vetor[j];
	 vetor[j] = temp;
	 i++;
	 j--;
	 }
   }
}