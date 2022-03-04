package Introducao;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n1, n2, n3, mediaFinal, ponderada, p1, p2, p3;

		System.out.println("Insira um valor: ");
		n1 = sc.nextDouble();

		System.out.println("Insira outro valor: ");
		n2 = sc.nextDouble();

		System.out.println("Insira o último valor: ");
		n3 = sc.nextDouble();

		p1 = n1 * 2;
		p2 = n2 * 3;
		p3 = n3 * 5;
		ponderada = 5 + 3 + 2;
		mediaFinal = (p1 + p2 + p3) / ponderada;
		
		System.out.println("O resultado do cálculo é igual a " + mediaFinal);
	}

}
