package exceptions;

@SuppressWarnings("serial")
public class TiException extends Exception {
	
	public TiException() {
		super("\nLa persona debe ser mayor de edad para ingresar a la tienda\n");
	}
}
