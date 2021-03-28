package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String respo="S", men = "";
		int regi = 0;
		
		while (respo.equals("S") || respo.equals("s")) {
			regi++;
			System.out.println("\n--------------------");
			System.out.println("Registro " + regi);
			System.out.println("--------------------");
			System.out.print("Nombre de alumno: ");
			sc.nextLine();
			System.out.print("Nota 1: ");
			int not1 = sc.nextInt();
			System.out.print("Nota 2: ");
			int not2 = sc.nextInt();
			System.out.print("Nota 3: ");
			int not3 = sc.nextInt();
			System.out.print("Asistencia[1-12]: ");
			float asis = sc.nextInt();
			System.out.println("\n--------------------");
			System.out.println("     Resultados");
			System.out.println("--------------------");
			float prom = not1 * 0.2f + not2 * 0.3f + not3 * 0.5f;
			if (prom > 13 & asis > 8.4) men = "Obtiene certificado";
			else men = "No obtiene certificado";
			System.out.println("Promedio: " + prom);
			System.out.println("Asistencia: " + (asis*100)/12 + "%");
			System.out.println("Estado: " + men);
			sc.nextLine();
			System.out.print("¿Registrar otro? [S/N]: ");
			respo = sc.nextLine();
		}

	}

}
