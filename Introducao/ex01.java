package Introducao;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		
		int anos, meses, dias, total; 
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Quantos Anos completos voc� tem? ");
		anos = sc.nextInt();
		
		System.out.print("Em que m�s voc� est�? ");
		meses = sc.nextInt();
		
		System.out.print("E que dia? ");
		dias = sc.nextInt();
		
		total = (anos * 365 ) + (meses * 30) + dias ;
		System.out.print("\nVoc� j� viveu " + total + " dias!");
		
		sc.close();		
	}
		
}


