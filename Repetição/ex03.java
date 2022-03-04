package Repetição;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, maior = 0, menor = 0;
		
		while(idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
			if(idade < 21) {
				menor++;
			}
			if(idade > 50) {
				maior++;
			}
		}
		System.out.println("Pessoas com menos de 21 anos: " + (menor - 1));
		System.out.println("Pessoas com menos de 50 anos: " + maior);
	}

}
