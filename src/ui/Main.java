package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.TiException;
import model.MiBarrioTeQuiere;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		
		//variables
		
		sc = new Scanner(System.in);
		int selection, type_selection, id_number;
		String id_type = "";
		MiBarrioTeQuiere mbtq = new MiBarrioTeQuiere();
		
		//Menu
		
		System.out.println("******Mi barrio de quiere******");
		System.out.println("Por favor presione el numero correspondiente a la opcion que desee usar: ");
		System.out.println("1. Registrar ingreso de una persona");
		System.out.println("2. Cantidad de personas que han intentado ingresar");
		System.out.println("3. Salir del programa");
		selection = sc.nextInt();
		System.out.println("Tipo de identificacion: ");
		System.out.println("1.TI - Tarjeta de identidad");
		System.out.println("2.CC - Cedula de ciudadania");;
		System.out.println("3.PP - Pasaporte");
		System.out.println("4.CE - Cedula de extranjeria");
		type_selection = sc.nextInt();
		
        switch (type_selection) {
		case 1:
			id_type = "TI";
			break;
		case 2:
			id_type = "CC";
			break;
		case 3:
			id_type = "PP";
			break;
		case 4:
			id_type = "CE";
			break;
		}
		try {
			if (id_type.equals("TI")) {
				throw new TiException();
			}

		} catch (TiException tiException) {
			System.out.println(new TiException().getMessage());
		}
		
		try {
			if (type_selection > 1 && type_selection <= 4) {
				System.out.println("Ingrese el numero de identificacion:");
				id_number = sc.nextInt();
				mbtq.addPerson(id_type, id_number);
				
			}
		} catch (InputMismatchException ime) {
			System.out.println("Solo se admiten numeros en este campo");
		}

	}

}
