package br.com.generation.ex;

import java.util.Scanner;
/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/
public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double [] vetor = new double[5];
		double maior = 0.0;
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite um valor para "+(i+1)+"� posi��o: ");
			vetor[i] = leia.nextDouble();
			
			if(vetor[i]>maior) {
				maior = vetor[i];
			}
			
		}
		System.out.println("A maior pontua��o �: "+ maior);
		leia.close();
	}
}
