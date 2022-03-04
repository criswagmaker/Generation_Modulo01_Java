package Introducao;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, x2, y, y2,totalX, totalY;
		
		System.out.println("Insira um valor para A");
		a = sc.nextDouble();
		
		System.out.println("Insira um valor para B");
		b = sc.nextDouble();
		
		System.out.println("Insira um valor para C");
		c = sc.nextDouble();
		
		System.out.println("Insira um valor para D");
		d = sc.nextDouble();
		
		System.out.println("Insira um valor para E");
		e = sc.nextDouble();
		
		System.out.println("Insira um valor para F");
		f = sc.nextDouble();
		
		x = (c * e) - (b * f);
		x2 = (a * e) - (b * d);
		totalX = x - x2;
		
		y = (a * f) - (c * d);
		y2 = (a * e) - (b * d);
		totalY = y - y2;
		
		System.out.println("O valor de x é " + totalX + "\nO valor de y é " + totalY);
	}

}
