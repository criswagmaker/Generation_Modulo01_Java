package Repetição;

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
		System.out.println("A média dos números múltiplos de 3 é igual a " + media);

	}

}
