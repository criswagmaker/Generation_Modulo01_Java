package Repeti��o;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, media = 0, multiplo = 0, soma = 0;

		do {
			System.out.println("Insira um valor: ");
			n = sc.nextInt();
			if (n % 3 == 0) {
				multiplo++;
			}
			soma = n + soma;

		} while (n != 0);
		media = soma / multiplo;
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 � igual a " + media);

	}

}
