package Condicional;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.println("Insira sua idade e descubra em qual categoria voc� se encaixa!..");
		idade = sc.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria | Infantil");
			
		}
		if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria | Juvenil");
		}
		if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria | Adulto");
		}

	}

}
