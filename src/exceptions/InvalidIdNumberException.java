package exceptions;

public class InvalidIdNumberException extends Exception {

	public InvalidIdNumberException() {
		super("\nEl numero de identificacioin debe tener mas de 3 digitos\n");
	}
}
