package exceptions;

public class GovernmentNormativeException extends Exception {
	
	public GovernmentNormativeException() {
		super("Por norma gubernamental la persona no puede salir hoy. Ambos, penultimo numero de identificacion y dia de hoy, son pares");
	}	
}
