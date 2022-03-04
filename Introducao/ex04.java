package Introducao;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Insira um valor: ");
		a = sc.nextDouble();
		
		System.out.println("Insira um valor: ");
		b = sc.nextDouble();
		
		System.out.println("Insira um valor: ");
		c = sc.nextDouble();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		
		d = (r + s) / 2;
		
		System.out.println("O resultado da expressão é igual a " + d);

	}

}
