package br.com.generation.ex;

import java.util.Scanner;
/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double [] vetor = new double[5];
		double maior = 0.0;
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite um valor para "+(i+1)+"° posição: ");
			vetor[i] = leia.nextDouble();
			
			if(vetor[i]>maior) {
				maior = vetor[i];
			}
			
		}
		System.out.println("A maior pontuação é: "+ maior);
		leia.close();
	}
}
