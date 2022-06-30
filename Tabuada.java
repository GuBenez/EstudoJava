package br.com.fiap.modulo5;

/* Elabore um programa para fazer a tabuada de um número fornecido pelo usuário,
 * e mostre o resultado a cada iteração. 
 */

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		String opcao;
		Scanner sc = new Scanner(System.in); 
		
		do {
			int cont = 0; //seta o valor 0 para o contador para que se inicie uma nova tabuada
			System.out.println("Digite o número que você gostaria de ver a Tabuada: ");
			int numero = sc.nextInt(); //deixa o usuário escolher a tabuada desejada
		
			
			// laço que realiza o calculo e a impressão da tabuada
			do {
				int result = numero * cont;
				System.out.println(numero + " x " + cont + " = " + result);
				cont ++;
			}while(cont <= 10);
			
			
		System.out.println("Deseja ver mais alguma tabuada? [s/n]");
		opcao = sc.next();
		}while(opcao.equals("s")); //fecha o laço do primeiro "DO-WHILE".
	}
}
