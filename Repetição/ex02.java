package Repetição;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vet = new int[10];
		int i, qtdP = 0, qtdI = 0;
		
		for(i = 0;i < 10;i++) {
			System.out.println("Insira os valores: ");
			vet[i] = sc.nextInt();
			if(vet[i] % 2 == 0) {
				qtdP++;
			}
			if(vet[i] % 2 != 0) {
				qtdI++;
			}
		}
		System.out.println("Total de números pares: " + qtdP);
		System.out.println("Total de números ímpares: " + qtdI);

	}

}
