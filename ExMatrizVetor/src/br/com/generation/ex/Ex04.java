package br.com.generation.ex;

import java.util.Scanner;

public class Ex04 {
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
	
	public static void main(String[] agrs) {
		
		Scanner leia = new Scanner(System.in);
		double [][] mat = new double [3][3];
		double soma = 0.0;
		
		for(int l=0; l<=2; l++) {
			for(int c=0; c<=2; c++) {
				System.out.printf("Digite o o valor para %d%d: ",l,c);
				mat[l][c] = leia.nextDouble();
				soma = soma+mat[l][c];
			}
		System.out.println();
		}
		System.out.println("O valor total da matriz é: "+soma);
		soma = mat[0][0]+mat[1][1]+mat[2][2];
		System.out.println("O valor da diagonal: "+soma);
		leia.close();
	}
}
