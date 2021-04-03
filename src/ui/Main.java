package ui;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.GovermentNormativeException;
import exceptions.TiException;
import model.MiBarrioTeQuiere;
import java.time.LocalDate;
import java.lang.System;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		
		//variables
		
		sc = new Scanner(System.in);
		int selection, type_selection = 0, id_number, penultimate_number, attemps = 0;
		String id_type = "";
		boolean exit = false;
		MiBarrioTeQuiere mbtq = new MiBarrioTeQuiere();
		
		
		//Menu
		
		do {
			try {
				System.out.println("******Mi barrio de quiere******");
				System.out.println("Por favor presione el numero correspondiente a la opcion que desee usar: ");
				System.out.println("1. Registrar ingreso de una persona");
				System.out.println("2. Cantidad de personas que han intentado ingresar");
				System.out.println("3. Salir del programa");
				selection = sc.nextInt();
				
				if (selection == 1) {
					
					System.out.println("******Tipo de identificacion******");
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
			        
			        attemps++;
			        
					try {
						if (id_type.equals("TI")) {
							throw new TiException();
						}
						else if (type_selection > 1 && type_selection <= 4) {
						
							System.out.println("Ingrese el numero de identificacion:");
							id_number = sc.nextInt();
							mbtq.addPerson(id_type, id_number);
							penultimate_number = Integer.parseInt(mbtq.penultimateIdNumber(String.valueOf(id_number)));
							try {
								if (penultimate_number % 2 == 0 && LocalDate.now().getDayOfMonth() % 2 == 0) {
									throw new GovermentNormativeException();
								}
								if (penultimate_number % 2 != 0 && LocalDate.now().getDayOfMonth() % 2 != 0){
									throw new GovermentNormativeException();
								}
								mbtq.addPerson(id_type, id_number);
								System.out.println("Ingreso registrado");
								
							} catch (GovermentNormativeException gne) {
								System.out.println(new GovermentNormativeException().getMessage());
							}
						}
						
					} catch (TiException tiE) {
						System.out.println(new TiException().getMessage());
					}
				}
				else if (selection == 2) {
					System.out.println("Intentos de ingreso: " + attemps);
				}
				if (selection == 3) {
					System.exit(0); //close the program
				}
				
			} catch (InputMismatchException ime) {
				System.out.println("Solamente se admiten numeros en este campo");
			}
		} while (exit);
		
		
	}

}