package com.senati.eti;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i = 0, factorial = 1;
		String rpta = "";
		
		System.out.print("Ingrese número: ");
		n = sc.nextInt();
				
		if (n>=1 && n<=7) {
			i = n;
			while ( i!=0) {;
			  factorial=factorial*i;
			  i--;
			}
		System.out.println("El factorial de " + n + " es: " + factorial);
		}
		
		else 
		 System.out.println("El número es superior de 7");
		}
		
	}
	

