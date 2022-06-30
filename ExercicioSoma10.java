package br.com.fiap.modulo5;

/* Elabore um programa para ler 10 valores inteiros fornecidos pelo usuário e
 * calcular a soma entre eles. Apresente o resultado ao final. 
 */

import java.util.Scanner;

public class ExercicioSoma10 {
	
	public static void main(String[] args) {
		int numero = 10; //irá realizar a soma 10 vezes
		int registro = 0;
		int soma = 0;
		Scanner sc = new Scanner(System.in); //entrada de dados
		do {
			registro++;
			System.out.println("Digite o número " + registro);
			int n = sc.nextInt();
			soma = n + soma;
		} while (registro < numero);
		System.out.println("A soma foi: " + soma);
	}
}
