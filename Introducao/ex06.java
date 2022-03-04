package Introducao;

import java.math.*;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x1, x2, y1, y2, d, raiz, potencia, ex, ey;

		System.out.println("Insira o valor de x1: ");
		x1 = sc.nextDouble();

		System.out.println("Insira o valor de y1: ");
		y1 = sc.nextDouble();

		System.out.println("Insira o valor de x2: ");
		x2 = sc.nextDouble();

		System.out.println("Insira o valor de y2: ");
		y2 = sc.nextDouble();

		ex = (x2 - x1) * (x2 - x1);
		ey = (y2 - y1) * (y2 - y1);
		potencia = ey + ex;
		raiz = Math.sqrt(potencia);
		
		System.out.println("O resultado da expressão é igual a " + raiz);
	}

}
