package Condicional;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, maior = 0;
		
			System.out.println("Insira um valor: ");
			n1 = sc.nextInt();
			
			System.out.println("Insira outro valor: ");
			n2 = sc.nextInt();
			
			System.out.println("Insira o último valor: ");
			n3 = sc.nextInt();
			
			if(n1 > n2 && n1 > n3) {
				maior = n1;
				System.out.println("O maior número inserido foi " + maior);
			}
			if(n2 > n1 && n2 > n3) {
				maior = n2;
				System.out.println("O maior número inserido foi " + maior);
			}
			if(n3 > n1 && n3 > n2) {
				maior = n3;
				System.out.println("O maior número inserido foi " + maior);
			}
			

	}

}
