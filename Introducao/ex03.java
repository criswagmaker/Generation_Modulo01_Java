package Introducao;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tempo, minutos = 0, horas = 0, segundos = 0, total;
		
		System.out.println("Insira em segundos a quantidade de tempo que o evento durou: ");
		tempo = sc.nextInt();
		horas = tempo / 3600;
		minutos = (tempo - (horas * 3600)) / 60;
		segundos = tempo % 60;
		
		System.out.println("O evento durou " + horas + ":" + minutos + ":" + segundos);

	}

}
