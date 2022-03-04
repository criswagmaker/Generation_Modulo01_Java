package Introducao;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double soma, porcentagem, imposto, fabrica, consumidor;
		
		System.out.println("Insira o custo de fábrica do carro");
		fabrica = sc.nextDouble();
		
		imposto = fabrica * 0.45;
		porcentagem = fabrica * 0.28;
		soma = (imposto + porcentagem) + fabrica;
		
		System.out.println("O valor para o consumidor é R$" + soma);
	}

}
