package com.senati.eti;

import java.util.Scanner;

public class Caso9_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String respo="S", men = "", nom_fi1 = "", nom_fi2 = "";
		int regi = 0, conce = 0, since = 0;
		float may_pro = 0, men_pro=0;
		
		while (respo.equals("S") || respo.equals("s")) {
			regi++;
			System.out.println("\n--------------------");
			System.out.println("Registro " + regi);
			System.out.println("--------------------");
			System.out.print("Nombre de alumno: ");
			String nombre= sc.nextLine();
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
			if (prom > 13 & asis > 8.4) {
				men = "Obtiene certificado";
				conce = conce + 1;
			}
			else {
				men = "No obtiene certificado";
				since = since + 1;
			}
			if (regi == 1) {
				men_pro = prom;
				may_pro = prom;
				nom_fi2 = nombre;
			}
			System.out.println("Promedio: " + prom);
			System.out.println("Asistencia: " + (asis*100)/12 + "%");
			System.out.println("Estado: " + men);
			sc.nextLine();
			//Resumen
			if (prom > may_pro) {
				may_pro = prom;
				nom_fi1 = nombre;
			}
			else if (prom < men_pro) {
				men_pro = prom;
				nom_fi2 = nombre;
			}
			System.out.print("¿Registrar otro? [S/N]: ");
			respo = sc.nextLine();
			
		}

		System.out.println("\n--------------------");
		System.out.println("     Resumen");
		System.out.println("--------------------");
		System.out.println("Número de alumnos: " + regi);
		System.out.println("Mayor promedio: " + may_pro + " pertenece a " + nom_fi1);
		System.out.println("Menor promedio: " + men_pro + " pertenece a " + nom_fi2);
		System.out.println("Número de alumnos certificados: " + conce);
		System.out.println("Número de alumnos sin certificados: " + since);
	}

}
