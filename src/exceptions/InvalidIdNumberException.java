package exceptions;

public class InvalidIdNumberException extends Exception {

	public InvalidIdNumberException() {
		super("El numero de identificacioin debe tener mas de 3 digitos");
	}
}
