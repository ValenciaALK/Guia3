package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String respo="S", men = "", nom_1="", nom_2="", tar_nom = "";
		int regi = 0, meta_al = 0, tar_lit = 0;
		float su_men = 0, su_may = 0;
		
		while (respo.equals("S") || respo.equals("s")) {
			regi++;
			System.out.println("---------------------------");
			System.out.println("Registro de Empleados (" + regi + ")");
			System.out.println("---------------------------");
			System.out.print("Empleado: ");
			String nombre = sc.nextLine();
			System.out.print("Horas trabajadas: ");
			int hor_tra = sc.nextInt();
			System.out.print("Tarifa por hora: ");
			float tar_hor = sc.nextInt();
			System.out.print("Minutos de tardanza: ");
			int tardan = sc.nextInt();
			System.out.println("\n--------------------");
			System.out.println("     Resultados");
			System.out.println("--------------------");

			float sue_bru = hor_tra * tar_hor, bon = 0, des = 0;

			if (regi == 1) {
				su_men = sue_bru;
				su_may = sue_bru;
				nom_2 = nombre;
				tar_lit = tardan;
			}
			
			if (hor_tra <= 50) bon = 0;
			else if (hor_tra > 50 & hor_tra <= 60) bon = sue_bru * 0.02f;
			else if (hor_tra > 60 & hor_tra <= 70) bon = sue_bru * 0.08f;
			else if (hor_tra > 70 & hor_tra <= 80) bon = sue_bru * 0.13f;
			else if (hor_tra > 80) bon = sue_bru * 0.05f;
			
			float meta = (hor_tra*100)/80;
			
			System.out.println("Sueldo bruto: " + sue_bru);
			System.out.println("Bonificaci�n: " + bon);
			System.out.println("Descuento: " + des);
			System.out.println("Sueldo neto: " + (sue_bru + bon - des) );
			System.out.println("& Alcanzado: " +  meta + "%");
			sc.nextLine();
			System.out.println("-------------------------");
			System.out.print("�Nuevo empleado? [S/N]: ");
			respo = sc.nextLine();
			
		}
	}

}
