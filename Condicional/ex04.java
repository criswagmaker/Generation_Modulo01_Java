package Condicional;

import java.util.Scanner;
import java.math.*;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n, raiz = 0, potencia;
		
		System.out.println("Insira um valor ");
		n = sc.nextInt();
		
		if(n % 2 == 0) {
			raiz = Math.sqrt(n);
			System.out.println("O número inserido é par\nSua raiz é igual a " + raiz);
		}
		
		if(n % 2 != 0) {
			potencia = Math.pow(n, 2);
			System.out.println("\nO número inserido é ímpar\nSeu valor elevado ao quadrado é igual a " + potencia);
			
		}

	}

}
