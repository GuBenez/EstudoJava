package br.com.fiap.modulo5;

//exemplo de estrutura While

public class While {
	public static void main(String[] args) {
		
		int qtdproduto = 5;
		int registro = 0;
		
		while(registro < qtdproduto) {
			registro ++;
			System.out.println("O produto número " + registro + " foi registrado");
		}
		int numero = 0;
		while (numero < 10) {
			numero ++;
			System.out.println(numero);
		}
	}
	
	
}
