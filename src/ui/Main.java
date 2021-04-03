package ui;

import java.util.Scanner;

import model.MiBarrioTeQuiere;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int selection;
		MiBarrioTeQuiere mbtq = new MiBarrioTeQuiere();
		System.out.println("******Mi barrio de quiere******");
		System.out.println("Por favor presione el numero correspondiente a la opcion que desee usar: ");
		System.out.println("1. Registrar ingreso de una persona");
		System.out.println("2. Cantidad de personas que han intentado ingresar");
		System.out.println("3. Salir del programa");
		selection = sc.nextInt();

		if (selection == 1) {
			String id_type;
			System.out.println("Tipo de identificacion: ");
			System.out.println("1.TI - Tarjeta de identidad");
			System.out.println("2.CC - Cedula de ciudadania");;
			System.out.println("3.PP - Pasaporte");
			System.out.println("4.CE - Cedula de extranjeria");
			int type = sc.nextInt();
			
			

				
	
			
		} else if (selection == 2) {

		} else if (selection == 3) {

		}

	}

}
