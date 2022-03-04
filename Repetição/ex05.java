package Repetição;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, n;
		
		do {
			System.out.println("Insira um valor para soma: ");
			n = sc.nextInt();
			soma = n + soma;
		}while(n != 0);
		System.out.println("A soma dos números é: " + soma);
	}

}
