package Collections;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collection;

import java.util.Collections;

public class ex01 {
	public static void main(String[] args) {

		ArrayList<String> estoque = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
				
		int resposta;
		//adicionando elementos
		System.out.println("Adicionando elementos:");
		estoque.add("Estomazil");
		estoque.add("Dipirona");
		estoque.add("Ibuprofeno");
		estoque.add("Benegripe");
		Collections.sort(estoque);
		System.out.println(estoque);
		System.out.println();
		
	
		
		//inserindo elementos
		System.out.println("Inserindo/Atualizando elementos:");
		estoque.set(3, "Rivotril"); 
		estoque.set(1, "Paracetamol");
		Collections.sort(estoque);
		System.out.println(estoque);
		System.out.println();
		
		//removendo elementos
		System.out.println("\nRemovendo elementos:");
		estoque.remove(2);
		estoque.remove(1);
		Collections.sort(estoque);
		System.out.println(estoque);
		System.out.println();
		
		//remove todos os dados da Array
		System.out.println("Removendo todos os dados do Array:");
		estoque.clear();
		System.out.println(estoque);
		
		

	}
}
