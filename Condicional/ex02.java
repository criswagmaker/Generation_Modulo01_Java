package Condicional;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Insira um valor: ");
		n1 = sc.nextInt();
		
		System.out.println("Insira outro valor: ");
		n2 = sc.nextInt();
		
		System.out.println("Insira o último valor: ");
		n3 = sc.nextInt();
		
		System.out.println("\n");
		
		if(n1 < n2 && n1 < n3) {
			System.out.println(n1);;
			if(n2 < n3) {
				System.out.println(n2);
				System.out.println(n3);
			}
			else {
				System.out.println(n3);
				System.out.println(n2);
			}
		}
		if(n2 < n1 && n2 < n3) {
			System.out.println(n2);
			if(n1 < n3) {
				System.out.println(n1);
				System.out.println(n3);
			}
			else{
				System.out.println(n3);
				System.out.println(n1);
			}
		}
		if(n3 < n1 && n3 < n2) {
			System.out.println(n3);
			if(n1 < n2) {
				System.out.println(n1);
				System.out.println(n2);
			}
			else {
				System.out.println(n2);
				System.out.println(n1);
			}
			
		}
		
	}

}
