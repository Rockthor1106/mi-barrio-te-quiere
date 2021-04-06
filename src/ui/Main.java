package ui;


import java.util.InputMismatchException;
import java.util.Scanner;
import exceptions.InvalidIdNumberException;
import exceptions.TiException;
import model.MiBarrioTeQuiere;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		
		//variables
		
		sc = new Scanner(System.in);
		int selection, type_selection = 0, id_number = 0, attemps = 0, back;
		String id_type = "";
		boolean repeat = false;
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
							
							try {
								if (mbtq.howMuchDigitsHave(id_number) < 3) {
									throw new InvalidIdNumberException();
								}
								else {
									if (mbtq.registerPerson(id_type, id_number,true) == true) {//The third parameter is true because in this part the person that wants get into is adult
										System.out.println("--- Ingreso Registrado ---");
									} 
									System.out.println("1. Regresar al menu inicio");
									back = sc.nextInt();
									System.out.println();
									if (back == 1) {
										repeat = true;
									}
									else {
										System.out.println("No existe una opcion asociada al numero ingresado");
									}
								}
							} catch (InvalidIdNumberException inide) {
								System.out.println(new InvalidIdNumberException().getMessage());
							}
						}
						else {
							System.out.println("No existe una opcion asociada al numero ingresado");
						}
						
					} catch (TiException tiE) {
						System.out.println(new TiException().getMessage());
					}
					
				}
				else if (selection == 2) {
					System.out.println("\n---------------------------------");
					System.out.println("Intentos de ingreso: " + attemps);
					System.out.println("---------------------------------\n");

				}
				else if (selection == 3) {
					repeat = false; //close the program
				}
				else {
					System.out.println("No existe una opcion asociada al numero ingresado");
				}
				
			} catch (InputMismatchException ime) {
				System.out.println("Se introdujo un elemento no numerico o un elemento numerico pero con un rango no admitido");
			}
		} while (repeat);	
		
	}

}