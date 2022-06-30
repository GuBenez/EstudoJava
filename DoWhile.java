package br.com.fiap.modulo5;

//exemplos de estruturas DO - WHILE 

public class DoWhile {
	
	public static void main(String[] args) {
		
		int qtdproduto = 5;
		int registro = 0;
		
		do {
			registro ++;
			System.out.println("O caixa registrou o produto " + registro);
		} while (registro < qtdproduto);
		
		int numero = 0;
		do {
			numero ++;
			System.out.println(numero);
		} while (numero < 10);
	}
}
