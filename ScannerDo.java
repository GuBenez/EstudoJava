package br.com.fiap.modulo5;

//Exercicio utilizando o método de entrada Scanner e o laço de repetição DO - While

import java.util.Scanner;

public class ScannerDo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String opcao;
		do {
			System.out.println("Digite um número: ");
			int n1 = sc.nextInt();
			System.out.println("Digite outro número: ");
			int n2 = sc.nextInt();
			int soma = n1 + n2;
			System.out.println("A soma é " + soma);
			System.out.println("Deseja somar mais números? [s/n]");
			opcao = sc.next();
		} while(opcao.equals("s"));
		sc.close();
	}
}
