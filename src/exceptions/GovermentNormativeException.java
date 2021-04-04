package exceptions;

public class GovermentNormativeException extends Exception {
	
	public GovermentNormativeException() {
		super("\nPor norma gubernamental la persona no puede entrar en la tienda hoy" + 
		"\nRecuerde que una persona puede salir si y sólo si cumple el siguiente requisito:" + 
		"\nEl penultimo numero de su identificacion es par y el dia impar, y viceversa\n");
	}
}
