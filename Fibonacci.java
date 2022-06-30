package br.com.fiap.modulo5;

/* Elabore um programa que calcule a sequência de Fibonacci até o 30º termo.
 * A sequência segue o seguinte padrão 1, 1, 2, 3, 5, ... n.
 */

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int termo1 = 0;
		int termo2 = 1;
		int termo3 = 0;
		int cont = 0;
		
		while(cont < 30) { //irá contar até o trigésimo termo, conforme solicitado na questão
			termo3 = termo1 + termo2; // inicia a sequência
			termo1 = termo2; //termo1 se transofrma no dois para a próxima soma
			termo2 = termo3; //termo2 se transforma no três para a próxima soma
			cont++; // contará +1 a cada número da sequência
			System.out.println(termo3); //fará a impressão de todos os termos
		}
		
	}
}
