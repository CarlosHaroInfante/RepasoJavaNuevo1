package edu.Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	public int opMenu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eliga una opción");
		
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Dar de Alta Alumno");
		System.out.println("[2] - Modificar Alumno");
		System.out.println("[3] - Borrar Alumno");
		
		int opcionElegida = sc.nextInt();
		
		return opcionElegida;
		
	}
}
