package br.com.fiap.modulo5;

// Exemplo de estruturas for

public class For {
	public static void main(String[] args) {
		
		int qtdprodutos = 6;
		//int registro = 0;
		
		for (int i = 1; i < qtdprodutos; i++) {
			System.out.println("O caixa registrou o produto " + i);
		}
		
		int numero = 0;
		for (int i = 20; i >= numero; i--) {
			System.out.println(i);
		}
	}
}
