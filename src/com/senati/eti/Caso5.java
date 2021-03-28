package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i = 1, num_menor = 999999999;
		
		while (i <= 5) {
			
			System.out.print("Ingrese número " + i + ": ");
			n = sc.nextInt();
			
			if (n < num_menor) num_menor = n;
				i++;
			
		}
		
		System.out.println("\n======== Resultados ========");
		System.out.println("El número menor es: " + num_menor);
		

	}

}
