package Repeti��o;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, estado = 0, sexo = 0, qtdC = 0, oCalmos = 0, fNervosas = 0, mAgressivos = 0, pessoas = 0;
		int maior = 0, menor = 0;
		
		while(pessoas < 5) {
			System.out.println("\nQual sua idade: ");
			idade = sc.nextInt();
			
			System.out.println("\n");
			System.out.print("Com qual g�nero voc� se identifica? \n1-Feminino\n2-Masculino\n3-Outros\n");
			sexo = sc.nextInt();
			
			System.out.println("\n");
			System.out.print("Como voc� classificaria seu comportamento? \n1-Calmo(a)\n2-Nervoso(a)\n3-Agressivo(a)\n");
			estado = sc.nextInt();
			
			if(estado == 1) {
				qtdC++;
			}
			if(sexo == 1 && estado == 2) {
				fNervosas++;
			}
			if(sexo == 2 && estado == 3) {
				mAgressivos++;
			}
			if(sexo == 3 && estado == 1) {
				oCalmos++;
			}
			if(idade > 40 && estado == 2) {
				maior++;
			}
			if(idade < 18 && estado == 1) {
				menor++;
			}
			pessoas++;
		}
		System.out.println("O n�mero de pessoas calmas foi de " + qtdC);
		System.out.println("O n�mero de mulheres que se consideravam nervosas � " + fNervosas);
		System.out.println("O n�mero de homens que se consideravam agressivos � " + mAgressivos);
		System.out.println("O n�mero de pessoas de outro g�nero que se consideravam calmos(as) � " + oCalmos);
		System.out.println("O n�mero de pessoas com mais de 40 anos que se consideravam nervosas � " + maior);
		System.out.println("O n�mero de pessoas com menos de 18 anos que se consideravam calmas � " + menor);
		
	}

}
