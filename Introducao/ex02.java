package Introducao;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int anos, meses, dias, total;

		System.out.print("Digite quantos dias voc� j� viveu: ");
		total = sc.nextInt();

		anos = total / 365;

		meses = total % 365;

		dias = meses % 30;

		meses = meses / 30;

		System.out.println("Voc� tem " + anos + " anos, " + meses + " meses e " + dias + " dias de vida!");

	}

}
